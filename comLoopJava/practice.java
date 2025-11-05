package comLoopJava;

//           ************ Loop ***********

//Q1. Print ,hello world, 'n' times. Take 'n' as input from user.

//import java.util.Scanner;
//public class practice1 {
//    public static void main(String[] args) {
//
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter yor number");
//            int n = sc.nextInt();
//
//
//            for (int i = 0; i <= n; i++) {
//                System.out.println(i + ": Hello world");
//            }
//        }
//    }
//}

//Ascending order................

//public class practice1 {
//    public static void main(String[] args){
//
//        for (int i = 0; i <= 10; i++){
//
//            System.out.println(i + ":   hello");
//        }
//    }
//}
//Descending order................

//public class practice1 {
//    public static void main(String[] args) {
//
//        for (int i = 10; i >= 1; i--) {
//
//            System.out.println(i + ": hello ");
//        }
//    }
//}

//Q2. Print all the Even numbers From 1 to 100.

//public class practice1 {
//
//    public static void main (String[] args){
//
//        for (int i = 2; i <= 10; i++){
//            if(i % 2 == 0){
//                System.out.println("Even number: " + i);
//            }
//        }
//
//        }
//    }

//Q3. Print all  numbers from 1 to 100 which are either divisible by 5 or 3.

//public class practice1 {
//    public static void main(String[] args){
//
//        for (int i = 0; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 ==0){
//                System.out.println("Divisible by 5 , 3 :" + i);
//            }
//        }
//    }
//}

//Q4 pleas define which number divisible by 5 or 3 or Not divisible.

//public class practice1 {
//    public static void main(String[] args) {
//
//        for (int i = 0; i <= 100; i++) {
//
//            System.out.print(i);
//
//            if (i % 3 == 0 )
//                System.out.println(": Divisible by 3: " + i);
//            else if(i % 5 == 0)
//                System.out.println(": Divisible by 5: " + i);
//            else System.out.println(": Not divisible by 3 or 5: " + i);
//        }
//    }
//}

//Q5. Print the table of 'n'. Here 'n' is a integer which user will
// input.
//

//import java.util.Scanner;
//public class practice1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your table number ");
//            int num = sc.nextInt();
//            int count = 1;
//
//        for(int i = 1; i <=10;i++) {
//                System.out.println(count + ": " + num + " * " + i + " = " + (num * i));
//                count++;
//            }
//        }
//    }

//Q6. Write a Java program to find the GCD (Greatest Common Divisor)
// of two numbers using a loop.

//import java.util.Scanner;
//public class practice1 {
//    public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//
////        input n number................
//
//        System.out.println("Enter n number");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int gcd = 1;
//
////        condition check...........
//
//        for (int i = 1; i <= a && i <= b; i++ ){
//            if(a % i == 0 && b % i == 0){
//                gcd = i;
//            }
//        }
//        System.out.println("GCD OF " + a + "AND" + b + "IS" + gcd);
//    }
//}
//

//Q7. Write a Java program to check if a given string is a palindrome
// or not using a loop.

//import java.util.Scanner;
//public class practice1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
////        input n number...........
//
//        System.out.println("Enter n number");
//
//        String str = sc.nextLine();
//        String ibro = "";
//
//
////        condition check.............
//
//        for(int i = str.length() - 1; i >= 0; i--){
//            ibro = ibro + str.charAt(i);
//        }
//
//        if(str.equalsIgnoreCase(ibro)){
//            System.out.println(str + "is the palindrome.");
//        }else
//            System.out.println(str + "is not the palindrome.");
//
//    }
//}

//Q7. Write a Java program to generate and print the first 'n' terms
// of the Fibonacci series.

import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        input n number...........

        System.out.println("Enter n number");

        int n = sc.nextInt();
        int first = 0, second = 1;

//        condition check.............

        for(int i = 0; i <= n; i++){
            System.out.println(first + "");
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();

    }
}
