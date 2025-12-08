package com.PatternPracticejava;

//1)....
//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args){
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        //condition check........
//
//        for(int i = 1; i <= 4; i++){
//            int count = (i == 1) ? 4 : 5;
//            for(int j = 1; j <= count; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}


//2).......

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args){
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        //condition check........
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

// 3)...........

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args){
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        //condition check........
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print((char) (j+64) + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}


//4).......

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args){
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        //condition check........
//
//        for(int i = 1; i <= n; i++){
//            if(i % 2 == 1){
//                for(int j = 1; j <= i; j++){
//                    System.out.print(j + " ");
//                }
//            }else{
//                for(int j = 0; j < i; j++){
//                    System.out.print((char) ('A' + j) + " ");
//               }
//            }
//            System.out.println();
//         }
//    }
//}

// 5)..............

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        //condition check........
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n+1; i++) {
//            System.out.print("*" + " ");
//        }
//        System.out.println();
//            for (int i = n; i >= 1; i--) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*" + " ");
//                }
//                System.out.println();
//            }
//        }
//    }

//6)...........
//
//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//        //condition check........
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print("*" + " ");
//        }
//        System.out.println();
//        int nst = n-3;
//        for (int i = 1; i <= nst; i++){
//            for(int j = 1; j <= nst; j++){
//                System.out.print("#" + " ");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i <= n; i++){
//            System.out.print("*" + " ");
//        }
//    }
//}
//


// 7).............

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");   // for rows
//        int n = sc.nextInt();
//
//        //condition check........
//
//        for(int i = 1; i <= n; i++){
//            for(int j = i; j >= 1; j--){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//8).........

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");   // for rows
//        int n = sc.nextInt();
//
//        //condition check........
//        for (int i = 0; i < n; i++) {
//            System.out.print("  ".repeat(n - i - 1));
//
//            for (int j = -i; j <= i; j++) {
//                char ch = (char) ('A' + Math.abs(j));
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }
//
//    }
//
//}

//9).........

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");   // for rows
//        int n = sc.nextInt();
//
//        // condition check.........
//
//        for(int i = 1; i <=n*2-1; i++){
//            System.out.print((char) (i + 64) + " ");
//        }
//        System.out.println();
//
//        int nsp = 1;
//
//        for(int i = 1; i < n; i++){
//            for(int j = 1; j <= n - i; j++){
//                System.out.print((char)(j + 64) + " ");
//
//            }
//            for(int j = 1; j <= nsp; j++){
//                System.out.print("  ");
//
//            }
//            nsp += 2;
//
//            for(int j = n + i; j <= n*2-1; j++){
//                System.out.print((char)(j + 64) + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//10).......

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter n");   // for rows
////        int n = sc.nextInt();
////
////        // condition check.........
////
//        //first line.........
//
//        for(int i = 1; i <= n; i++){
//            System.out.print(i + " ");
//        }
//        for(int i = n - 1; i >= 1; i--){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//
//        // seconde line
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <=n-i; j++){
//                System.out.print(j + " ");
//            }
//            for(int s = 1; s <= i*2-1; s++){
//                System.out.print(" " + " ");
//            }
//            for(int j = n-i; j >= 1; j--){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//11).........

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");   // for rows
//        int n = sc.nextInt();
//
//        // condition check.........
//
//               for(int i = 1; i <= n; i++){
//                   for(int j = 1; j <= i; j++) System.out.print(" ");
//                   System.out.print("*");
//
//                   for(int j = i; j < n; j++) System.out.print("  ");
//                   if(i != n) System.out.print("*");
//
//                   System.out.println();
//               }
//            }
//        }


//12)............
//
//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");   // for rows
//        int n = sc.nextInt();
//
//        // condition check.........
//
//        // upper part (Ulta V)....
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j < n; j++) System.out.print(" ");
//            System.out.print("*");
//            for(int j = 1; j < (i -1) * 2; j++) System.out.print(" ");
//            if(i != 1) System.out.print("*");
//
//            System.out.println();
//        }
//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = i; j < n; j++) System.out.print(" ");
//            System.out.print("*");
//            for (int j = 1; j < (i - 1) * 2; j++) System.out.print(" ");
//            if (i != 1) System.out.print("*");
//            System.out.println();
//        }

//    }

//}


// 13).............

//import com.sun.security.jgss.GSSUtil;
//
//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");   // for rows
//        int n = sc.nextInt();
//
//        // condition check.........
//
//        for(int i = 1; i <=n; i++){
//            for(int j = i; j < n; j++) System.out.print("  ");
//            System.out.print(i);
//            for(int j = 1; j < (i -1) * 2; j++) System.out.print("  ");
//           if(i != 1) System.out.print(i);
//
//            System.out.println();
//        }
//    }
//}


// 14).............

//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args) {
//
//        // input number.........
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");   // for rows
//        int n = sc.nextInt();
//
//        // condition check.........
//        for(int i=1; i<=n; i++){
//            // Left spaces
//            for(int j=1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//
//            // Stars and middle spaces
//            for(int j=1; j<=2*i-1; j++){
//                if(j==1 || j==2*i-1 || j==i){
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//    }

// 15)............

import java.util.Scanner;
public class practice {
    public static void main(String[] args) {

        // input number.........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");   // for rows
        int n = sc.nextInt();


        // condition check.........

        for (int i = 1; i <= 3; i++) {

            for (int j = 3; j >= i; j--) {

                System.out.print(j + " ");

            }

            System.out.println();

        }

    }
}