package com.compositPatternjava;

//import java.util.Scanner;

//type 1st.........

//public class starPyramid {
//    public static void main(String[] args) {
//
//        //input number......
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows");
//        int n = sc.nextInt();
//
//        condition check.......
//
//        for (int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n-i; j++) {
//                System.out.print(" " + " ");    // spaces loop-....
//            }
//            for (int j = 1; j <= 2 * i -1; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//type 2nd......

import java.util.Scanner;
public class starPyramid {
    public static void main(String[] args) {

        //input number......

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();

        int nsp = n-1;
        int nst = 1;

//        condition check.......

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");    // spaces loop-....
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
}


