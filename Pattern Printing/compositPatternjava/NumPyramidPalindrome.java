package com.compositPatternjava;

import java.util.Scanner;
public class NumPyramidPalindrome {

    public static void main(String[] args) {

        //input number......

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //condition check.........

        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" " + " ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            for(int j=i-1; j >= 1; j-- ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}



//2nd type pelindrome...


import java.util.Scanner;
public class Basic2Darray {
    public static void main(String[] args) {

        //input condition.....
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" " + " ");
            }
            //1st half number
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }

            //2nd half number
            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
