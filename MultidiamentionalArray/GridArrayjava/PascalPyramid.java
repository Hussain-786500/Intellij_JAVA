package com.GridArrayjava;
import java.util.Scanner;
public class PascalPyramid {

    //    ******* Method to Print pascal pyramid *******
    public static void print(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n-i; s++) {
                System.out.print("  ");      //space print for pyramid
            }
//            ------print all element of current row------

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +"   ");  //extra space for pyramid

            }
            System.out.println();
        }
        System.out.println();
    }


    //    ******** Method to generate pascal triangle ********

    static int[][] pyramid(int n) {
        int[][] res = new int[n][]; // jagged array

        for (int i = 0; i < n; i++) {

            //1st step... ith row has (i+1) column
            res[i] = new int[i + 1];

            //2nd step....1st & last element of every row is 1

            res[i][0] = res[i][i] = 1;

            //3rd step
            for (int j = 1; j < i; j++) {
                res[i][j] = res[i - 1][j - 1] + res[i - 1][j];
            }
        }
        return res;
    }


//    ******* Main method: Program entry ********
    public static void main(String[] args){

        //------input number of row from user------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();

        //generate pascal terminal
        int[][] res = pyramid(n);

        //print the pascal pyramid
        print(res);
    }
}