package com.GridArrayjava;

import java.util.Scanner;

//Q1. Given an integer 'numRows', generate pascal's triangle.
public class PascalTriangle {

//    ******** Method to print for pascal triangle *********

    public static void pascal(int[][] arr) {
       int n = arr.length;

//       -------- Print all element for current row --------
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

//    ******** Method to generate to pascal's triangle ********

    static int[][] matrix(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {

            //1st step....ith row has i+1 column
            ans[i] = new int[i+1];     //jagged array

            //2nd step.....first & last element of every row is 1
            ans[i][0]  = ans[i][i] = 1;    //first & last element

            //3rd step
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }
        return ans;
    }

//    ********* Main method : Program entry ********

    public static void main(String[] args) {

//        ------- input number of row from user ------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

//        ------ generate pascal terminal ------
        int[][] ans = matrix(n);

//        ------ print the pascal triangle ------
        pascal(ans);
    }
}