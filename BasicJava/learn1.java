package com.BasicJava;

//********************Basics**********************

//public class learn1 {
//    public static void main(String[] args) {
//        System.out.println("Helo world");
//    }
//
//}
//
//variables........(int is a type not variables)

//public class learn1 {
//    public static void main(String[] args){
//        int x;     // declaration
//        x = 6;     // initialization
//        int y = 10;   //declaration and initialization      // 10
//        System.out.println(x);     // 6   this is variables
//        System.out.println("hello");   // hello      this is text
//        System.out.println(y);
//
//        System.out.println(x+y);        // addition 16
//    }
//}

//updation Variables......
//public class learn1 {
//    public static void main(String[] args){
//      int x;
//       x = 8;
//        System.out.println(x);       // 8
//         x = 10;
//        System.out.println(x);       // 10
//        x = x+8;
//        System.out.println(x);       // 18
//        x = x-20;
//        System.out.println(x);       // -2
//        x = x*-1;
//        System.out.println(x);       // 2
//         x += 7;
//        System.out.println(x);       // 9
//        x -= 5;
//        System.out.println(x);       // 4
//        x *= 3;
//        System.out.println(x);       // 12
//        x /= 4;
//        System.out.println(x);       // 3
//    }
//}

import java.util.Scanner;

// Arithmetic operations int data type........
//public class learn1 {
//    public static void main(String[] args){
//        int x = 5;
//        int y = 2;
//        System.out.println(x+y);   // 7
//        System.out.println(x-y);   // 3
//        System.out.println(x*y);   // 10
//        System.out.println(x/y);   // 2
//    }
//}

// Double and Float Data Type..........
//public class learn1 {
//  public static void main(String[] args){
//      Double x = 3.1;
//      Float y = 2.87f;
//      System.out.println(x);  // 3.1
//      System.out.println(y);  // 2.87
//      System.out.println(x+y);    // 5.96999
//public class learn1 {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the 1st number");
//        int a = sc.nextInt();
//
//        System.out.println("Enter the 2nd Number");
//        int b = sc.nextInt();
//
//        System.out.println(a+b);
//    }
//}

// Modulus Operator..............

//public class learn1 {
//    public static void main(String[] args){
//        int a = 10;
//        int b = 4;
//        System.out.println(a%b);       // 2
//        System.out.println(3%23);      // 3
//        System.out.println(10%(-4));  // 2
//        System.out.println(-10%4);    // -2
//    }
//}

// Typecasting...........
// 1). int to double.............

//import java.util.Scanner;
//public class learn1 {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int x = sc.nextInt();
//        double y = (double) x;
//        System.out.println(y/2);
//    }
//}

// 2). double to int..........(provide precise value[remove decimal part])

//import java.util.Scanner;
//public class Practice1{
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number");
//
//        double x = sc.nextDouble();
//         int y = (int)x;
//        System.out.println(y);
//
//    }
//}


// Hierarchy of operators.............

//public class learn1{
//    public static void main(String[] args){
//        int i = 2 * 3/4]];
//
//        System.
//                out.println(i);     //1
//    }
//}

// int/int, int/double, double/int, double/double

//public class learn {
//    public static void main(String[] args){
//        double x = 5;
//     double y = 2;
//        System.out.println(x/y);      // 2.5
//
//        double x = 5 / 2;
//        System.out.println(x);        // 2.0
//
//        System.out.println(5.0/2.0);   // 2.5
//        System.out.println(5.0/2);      // 2.5
//        System.out.println(5/ 2.0);     // 2.5
//    }
//}


//input value (if/else/while/index)............

public class learn1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String CorrectName = "ibrahim";

//        (for while)..
//        while (true) {
//            System.out.println("Enter your name");
//            String name = sc.nextLine();

//       (for index)...
        for (int i = 1; i <= 100; i++){
            System.out.println("Attempt " + i + ": Enter your name");
            String name = sc.nextLine();

            if(name.equalsIgnoreCase(CorrectName)) {
                System.out.println("true - NAME IS CORRECT!");
                break;
            } else {
                System.out.println("false - NAME IS INCORRECT?");
            }
        }


    }
}
