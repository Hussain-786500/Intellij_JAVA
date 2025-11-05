package comLoopJava;

//Q1. Display this AP - 1, 3, 5, 7, 9....upto 'n' terms.

//import java.util.Scanner;
//public class AP {
//    public static void main(String[] args){
//        Scanner sc = new Scanner (System.in);
//
//        System.out.println("Enter n : ");
//        int n = sc.nextInt();
//
//        // 1, 2, 3, 4, 5,6......
//
//        for(int i = 1; i<= 2*n; i+=2){
//            System.out.println(i);
//        }
//
//    }
//}

//Q2. Display this Ap - 4, 7, 10, 13, 16....upto 'n' terms.

//1st type..........

//import java.sql.SQLOutput;
//import java.util.Scanner;
//public class AP {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n : ");
//        int n = sc.nextInt();
//
//        // 4, 7, 10, 13, 16.....
//
//        for (int i = 4; i<= 4*n; i+=3){
//            System.out.println(i);
//        }
//
//
//    }
//}

//2nd type...........

//import java.util.Scanner;
//
//public class AP {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
////        input value.............
//
//        System.out.println("Enter n ");
//        int n = sc.nextInt();
//        int a = 4;
//
////        condition check  4, 10, 13.........
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println("value: " + a);
//            a += 3;
//        }
//    }
//}

//-negative type.............

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input value.....

        System.out.println("Enter value n");
        int n = sc.nextInt();
        int a = 5, d = -4;

        //condition check  5 1, -3 -7, -11 -15........

        for (int i = 1; i <= n; i++){
            System.out.println("value: " + a);
            a += d;
        }

    }
}
