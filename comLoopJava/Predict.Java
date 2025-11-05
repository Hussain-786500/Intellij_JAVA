package comLoopJava;

//1st predict......

//public class Predict {
//    public static void main(String[] args){
//
//        int x = 1;
//        while (x == 1)
//            x = x - 1;
//        System.out.println(x);
//    }
//}

//    Q1.  WAP to count digits ofa given number.

//import java.util.Scanner;
//public class Predict {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        //input number.....
//        System.out.println("Enter n number");
//        int n = sc.nextInt();
//
//        int count = 0;
//        while(n != 0){
//            n /= 10;
//            count++;
//        }
//        System.out.println(count);
//    }
//}

//Q2. WAP to print sum of digits ofa given number.

//import java.util.Scanner;
//public class Predict {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n number");
//
//        int num = sc.nextInt();
//        int sum = 0;
//
//        while (num > 0) {
//            int ld = num % 10;
//            sum = sum + ld;
//            num = num / 10;
//
//        }
//        System.out.println("Sum of digits: " + sum);
//
//    }
//}
//


//  Q. WJP to calculate the sum of natural numbers up to  a given positive integer 'n'.

import java.util.Scanner;
public class Predict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        input n number..........

        while (true) {
            System.out.println("Enter n number");
            int num = sc.nextInt();
            int sum = 0;
            int ld = num % 10;

//        condition check.............

            while (num > 0) {
                sum = sum + ld;
                num = num / 10;
            }
            System.out.println("sum of digits; " + sum);
        }
    }
}

