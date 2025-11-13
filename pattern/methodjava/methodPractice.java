package com.methodjava;

//**************** Method/Function in Java ****************

//1)...........

//import java.util.Scanner;
//
//public class class1 {
//    public static void nameType(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        nameType(name);     // do call the function
//    }
//
//}

//2)..............

//import java.util.Scanner;
//public class class1 {
//    public static int calulatorSum(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calulatorSum(a , b);
//        System.out.println("sum of two numbers " + sum);
//    }
//}

//import java.util.Scanner;
//public class class1 {
//
//// method to add two numbers..........
//
//    public static int add(int a, int b) {
//            return a + b;
//        }
//        public static void main (String[]args){
//       Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter first number: ");
//            int a = sc.nextInt();
//
//            System.out.println("Enter second number: ");
//            int b = sc.nextInt();
//
//            // call the function......
//
//            int result = add (a, b);       // method call
//            System.out.println("sum: " + result);
//
//
//        }
//    }

//Q3. Make a function to multiply 2 numbers and return the project.

// type first.......

//    import java.util.Scanner;
//public class class1 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner (System.in);
//
////        input number ..........
//
//        System.out.println("Enter first  number");
//        int a = sc.nextInt();
//        System.out.println("Enter second number");
//        int b = sc.nextInt();
//
//        int c = (a * b);
//
////        condition check............
//        System.out.println("your final value: " + c);
//
//    }
//}

// type second...........

//import java.util.Scanner;
//
// static method.........
//
//public class class1 {
//   public static int calculate(int a, int b){
//       return a * b;
//   }
//
//   // input function........
//
//    public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter first value");
//       int a = sc.nextInt();
//        System.out.println("Enter second value");
//       int b = sc.nextInt();
//
//        System.out.println("your final value: " + calculate(a, b));
//    }
//          }

//Q2. Find the factorial of the number.

//type first..........

//import java.util.Scanner;
//public class class1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n number");
//        int n = sc.nextInt();
//
//        if (n < 0) {
//            System.out.println("invalid number");
//        }else{
//            int factorial = 1;
//
//            for (int i = 1; i <= n; i++) {
//            factorial = factorial * i;
//            }
//
//            System.out.println("factorial of :" + n + " = " + factorial);
//        }
//    }
//}

//second type..........


//import java.util.Scanner;
//public class class1 {
//
//    // method to calculate factorial.....
//
//    public static void factorial(int n) {
//        //lop
//
//        if (n < 0) {
//            System.out.println("invalid number");
//            return;
//        }
//
//        int factorial = 1;
//
//        // loop from n down to 1........
//
//        for (int i = n; i >= 1; i--) {
//            factorial = factorial * i;
//        }
//        System.out.println("factorial of : " + n + " = " + factorial);
//        return;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your value");
//        int n = sc.nextInt();
//
//        factorial(n);     // method call
//    }
//
//}


//Q3. Write a method to print squares of the first n natural numbers,
// taking n as an argument to the method.

//public class class1 {
//    public static void printSquare(int n){
//
//        for(int i = 1; i <= n; i++){
//            System.out.println("Square: " + i + " = " + (i * i));
//        }
//    }
//    public static void main(String[] args){
//        printSquare(7);
//    }
//}

//Q4. Write a method that takes the radius of a circle as an argument
// and returns its area.

// 1st type......

//public class class1 {
//     public static void main(String[] args){
//
//         double r = 3.5;
//         double pi = 3.14;
//
//         double area = pi * r * r;
//
//         System.out.println("Area of circle: " + area);
//
//     }
//
//}

//2nd type........with scanner........
//
//    import java.util.Scanner;
//public class class1 {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        // input type.........
//
//        System.out.println("Enter your radius");
//        double r = sc.nextDouble();
//
//        double pi = 3.14;
//        double area = pi * r * r;
//
//        System.out.println("your circle of area is: " + area);
//    }
//}

//3rd type..............

//public class class1 {
//    public static double findArea(double r){
//
//        double pi = 3.14;
//        double area = pi * r * r;
//        return area;
//    }
//
//    public static void main(String[] args){
//        double r = 4;
//        double result = findArea(r);
//        System.out.println("Area of circle: " + result );
//    }
//
//}


//4th type.........with scanner........through method......
//import java.util.Scanner;
//public class class1 {
//
//    //method to calculate area of circle using formula.........
//
//    public static double findArea(double r){
//        double pi = 3.14;
//        double area = pi * r * r;
//        return area;
//    }
//    // taking input radius from user..........
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter input radius of the circle");
//        double r = sc.nextDouble();
//
//        // calling method........
//
//        double result = findArea(r);
//
//        System.out.println("Area of circle is :" + result);
//
//        sc.close();
//    }
//}


//Q5. Given two numbers a and b, write a method to print all odd
// numbers between them.

//public class class1 {
//    public static void printOdd(int a, int b) {
//
//
//        //condition check...........
//
//        for (int i = a; i <= b; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//          }
//        }
//        public static void main (String[]args){
//            printOdd(10, 20);
//        }
//    }

//with scanner................

//import java.util.Scanner;
//public class class1 {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        //input number......
//        System.out.println("Enter the first number");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number");
//        int b = sc.nextInt();
//
////        condition check............
//
//        for(int i = a; i <= b; i++){
//            if(i % 2 == 1){
//                System.out.println(i);
//            }
//        }
//    }
//}

//for both even and odd number check...................
//     import java.util.Scanner;
//    public class class1 {
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//
////            //user choice......
//
//            System.out.println("What do you want to ? odd/Even");
//            String choice = sc.next().toLowerCase();
//
//            //input number..........
//
//            System.out.println("Enter the first number");
//            int a = sc.nextInt();
//            System.out.println("Enter the second number");
//            int b = sc.nextInt();
//
//            //condition check............
//
//            if(choice.equals("even")){
//                System.out.println("\nEven numbers between " + a + " and " + b + " are ");
//                for(int i = a; i <= b; i++){
//                    if(i % 2 == 0){
//                        System.out.println(i + " ");
//                    }
//                }
//            }
//            else if (choice.equals("odd")){
//                System.out.println("\nOdd numbers between " + a + " and " + b + " are ");
//             for(int i = a; i <= b; i++){
//                 if(i % 2 == 1){
//                     System.out.println(i + " ");
//                 }
//               }
//            }
//
//            sc.close();
//        }
//     }

//Q6. Write a method to count the number of digits in a number and then
// print the square of this number.

//1st type.......


//public class class1 {
//    public static void countSquare(String[] args) {
//
//        int n = 123;
//        int count = 0;
//
//
//        condition check.............
//
//        for (int i = n; i != n; i = i / 10){
//            count++;
//        }
//        int square = n * n;
//        System.out.println("Number of digits is " + n + " = " + count);
//        System.out.println("Number of square is " + n + " = " + square);
//
//    }
//}

//2nd type...........

//public class class1 {
//    public static void countSquare(int n){
//          int count = 0;
//
//          // for loop.of method.........
//
//        for (int i = n; i != 0; i = i / 10){
//            count++;
//        }
//        int square = n * n;
//        System.out.println("numbers of digits " + n + " = " + count);
//        System.out.println("number of square " + n + " = " + square);
//    }
//    public static void main(String[] args){
//        int num = 1234;
//        countSquare(num);
//    }
//}

//3rd.............

//import java.util.Scanner;
//public class class1 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
////        user input...........
//
//        System.out.println("Enter input number");
//        int n = sc.nextInt();
//        int count = 0;
//
//        // condition check.........
//
//        for (int i = n; i != 0; i = i / 10){
//            count++;
//
//        }
//        int square = n * n;
//        System.out.println("number of digits " + n + " = " + count);
//        System.out.println("number of square " + n + " = " + square);
//
//
//    }
//}

// Q7. state true and false

// (a). A method may be called more than once from any other method.
// (b). It is necessary for a method to return some value.

//type(a)............

//public class class1 {
//    public static void sayHello(){
//        System.out.println("HELLO");
//    }
//    //multiple print hello value return so this method is 'True'...
//
//    public static void main(String[] argsn){
//        sayHello();
//        sayHello();
//        sayHello();
//    }
//}

//type(b)............ false

//public class class1 {
//    public static void display(){
//        System.out.println("this method does not return any value");
//    }
//    public static void main(String[] args){
//        display();
//    }
//}

//Q8. Can the same method name be used for different methods without
// any conflict?

//public class class1 {
//
//    // method 1: one parameter..........
//
//    public static void show(int a){
//        System.out.println("Number: " + a);
//    }
//
//    // method 2: two parameter..........
//
//    public static void show(int a, int b){
//        System.out.println("Sum: " + (a + b));
//    }
//
//    // method 3: different type parameter..........
//
//    public static void show(String Name){
//        System.out.println("Name: " + Name);
//    }
//
//    // return value.........
//
//    public static void main(String[] args){
//        show(10);
//        show(5,10);
//        show("ibrahim");
//    }
//}