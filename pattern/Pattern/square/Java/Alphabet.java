package com.Pattern.square.Java;

// for double int number......

//import java.util.Scanner;
//public class Alphabet {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        //condition check..........
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                System.out.print(j + 65 + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// for Alphabet..............

import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //condition check..........

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
}
