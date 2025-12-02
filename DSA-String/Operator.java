package com.stringdsajava;

//public class Operator {
//    public static void main(String[] args){

//        1st type.....only latter print nt integer
//        String str = "abc";
//        str = str.concat("xyz");
//        System.out.println(str);
//
//        2nd type.....both print integer & latter(append add)..
//        String str = "abcd";
//        String t = "pqr";
//        str = str + 20;
//        System.out.println(str);

//        3rd type.....both print integer & latter(forward add)..
//
//        String str = "abcd";
//        String t = "pqr";
//        str = "raja " + str;
//        System.out.println(str);
//    }
//}

// Q1. sout("abc" + 10+20)....?.
//
//public class Operator {
//    public static void main(String[] args){
//
//        String str = "abs";
//        System.out.println(str + 10 + 20);      //print abc1020
//
//        System.out.println(10+ 20 + str);       //print 30abc
//    }
//}


// Q2. Take integer input and convert it into a string.

//import java.util.Scanner;
//
//public class Operator {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter yor number: ");
//        int n = sc.nextInt();
//        String str = " " + n;
//        System.out.println(str);
//    }
//}

// Q3. Return the total number of digit in a number without using any loop.
import java.util.Scanner;
        public class Operator {
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter yor number: ");
                long n = sc.nextLong();
//        String str = " " + n;
                String str = Long.toString(n);
                System.out.println(str);
                System.out.println(str.length());

            }
}
