package com.Xattern.Rectangle.java;
//
//import java.util.Scanner;
//public class NumberTrangle {
//    public static void main(String[] args){
//
//        //input value.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        // condition check.........
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// trangle for alphabet...........

import java.util.Scanner;
public class NumberTrangle {
    public static void main(String[] args){

        //input value.........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        // condition check.........

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(j + 64) +  " ");
            }
            System.out.println();
        }
    }
}
