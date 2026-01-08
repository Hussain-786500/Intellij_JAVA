package com.Pattern.square.Java;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args){

        // input number...........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        // condition check............

        for(int i = 1; i <= n; i++){   // control rows.......
            for(int j = 1; j <= n; j++){
                System.out.print("*");   // control column........
            }

            System.out.println();

        }
    }
}

//Hollow Square print..........

import java.util.Scanner;
public class Basic2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int r = sc.nextInt();
        System.out.println("Enter the column");
        int c = sc.nextInt();

        //outer loop
        for (int i = 1; i <= r; i++) {

            //inner loop
            for (int j = 1; j <= c; j++) {

                //condition check
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");       // print space
                }
            }
            System.out.println();
        }
    }
}
