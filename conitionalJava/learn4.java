package com.conitionalJava;



//******** multiple operator,(logical operators) ********

// 1).use && operator...........

//public class learn4 {
//    public static void main(String[] args){
//
//        int a = 10 , b = 30;
//
//     System.out.println(a > b && a < 40);
//        System.out.println(a < b && a < 40);    // true
//
//        }
//    }

//** 3 digit number input......

//import java.util.Scanner;
//public class learn4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter a number : ");
//            int n = sc.nextInt();
//
//            if (n > 99 && n < 1000) {
//                System.out.println("Only 3 digit Number");
//            } else {
//                System.out.println("Not A 3 Digit Number");
//            }
//        }
//    }
//}


// Q1. Take positive integer input and tell if it is a five
// digit number or not .

//import java.util.Scanner;
//public class learn4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter the number");
//            int n = sc.nextInt();
//
//            if (n > 55 && n < 500000) {
//                System.out.println("yes 5 digit number");
//            } else {
//                System.out.println("not 5 digit number");
//            }
//        }
//    }
//}


//2). use || operator.............

// Q2. Take positive integer input and tell if it is divisible
// by 5 or 3.

//import java.util.Scanner;
//public class learn4 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter value");
//            int n = sc.nextInt();
//
//            if (n % 5 == 0 || n % 3 == 0) {
//                System.out.println("is divisible ");
//            } else {
//                System.out.println("not divisible");
//            }
//        }
//    }
//}


//Q3. Take 3 positive integers input and print the
// greatest of them.

//import java.util.Scanner;
//
//public class learn4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        //input number.........
//        while (true) {
//            System.out.println("Enter your 1st number");
//            int a = sc.nextInt();
//
//            System.out.println("Enter your 2nd number");
//            int b = sc.nextInt();
//
//            System.out.println("Enter your 3rd number");
//            int c = sc.nextInt();
//
//            //condition check.........
//
//            if (a > b && a > c)
//                System.out.println(a+ "is largest number");
//
//
//            else if (b > a && b > c)
//                    System.out.println(b+ " is the largest number");
//
//                else
//                System.out.println(c+" is the largest number");
//
//
//
//        }
//    }
//}



//Q4. Take 3 positive integers input and print the least of them.

import java.util.Scanner;
public class learn4{
    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);

        // input number

        System.out.println("Enter the 1st  number");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd number");
        int c = sc.nextInt();

        // condition check.....

        int least = Math.min(a, Math.min(b, c));


        // print result
        System.out.println("The least number is: " + least);


    }
}