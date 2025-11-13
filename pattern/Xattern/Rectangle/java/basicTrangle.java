package com.Xattern.Rectangle.java;

import java.util.Scanner;
public class basicTrangle {
    public static void main(String[] args) {

        // input number.........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //condition check........

//        1st left aligned trangle......

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        2nd left aligned trangle.........

//        for (int i = 1; i <= n; i++){
//            for(int j = 1; j <= n + 1-i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

//import java.util.Scanner;
//public class basicTrangle {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();

        //condition check........

//        3rd right aligned trangle......
////
        for (int i = n; i >= 1; i--) {
            for(int j = n; j > i; j--){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

                }
            System.out.println();
            }

//        4th right aligned trangle.......

//
//        for (int i = 1; i <= n; i++) {
//            for(int j = n; j > i; j--){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//
//            }
//            System.out.println();
        }
      }
