package comLoopJava;

//           ************ Break *************

//Q1. WAP(write a program) to check if a number is composite or not.

//import java.util.Scanner;
//
//public class Break {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        //input value.....
//        System.out.println("Enter n value");
//        int n = sc.nextInt();
//        int x = 0;
////        condition check...........
//
//        for (int i = 2; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println("Composite number");
//                x = 1;
//                break;
//            }
//        }
//        if (n == 1)
//            System.out.println("Not Prime & Composite Number");
//        else if(x == 0)
//            System.out.println("Prime Number");
//
//    }
//}

public class Break {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

    }
}
