package comLoopJava;

// ********** geometric progression ************

//Q1. Display this GP - 1, 2, 4, 8, 16, 32,...up to 'n' terms.

//import java.util.Scanner;
//public class GP{
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        //input value......
//
//        System.out.println("Enter n value");
//        int n = sc.nextInt();
//        int a = 1;
//       condition check .......
//
//        for (int i = 1; i <= n; i++){
//            System.out.println("value: " + a);
//            a *= 2;
//
//        }
//    }
//}

//Q2. Display this GP - 3, 12, 48,.....up to 'n' terms.

import java.util.Scanner;
public class GP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input value......

        System.out.println("Enter n value");
        int n = sc.nextInt();
        int a = 3;

//        condition check...............

        for (int i = 1; i <= n; i++){
            System.out.println("value: " + a);

            a *= 4;

        }
    }
}