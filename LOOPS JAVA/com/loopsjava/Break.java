package com.loopsjava;

//          ********** Break Statement **********

import java.util.Scanner;

// Q-> WAP to check if a number is composite or not.
//public class Break {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//
//        for (int i = 2; i <= n-1; i++) {
//            if(n%i == 0){
//
//                System.out.println("Composite number");
//                break;
//            }
//        }
//    }
//}

// Q-> WAP to check if a number is Prime or not.

public class Break {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int x = 0;     // 0 means prime
        for (int i = 2; i <= n-1; i += 2) {
            if(n % i == 0){
                System.out.println("Composite Number");
                x = 1;    //1- means composite
                break;
            }
        }
        if(x == 0) System.out.println("Prime number");
    }
}
