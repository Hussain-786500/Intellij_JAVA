package com.specialPatternjava;

//1st type................


//import java.util.Scanner;
//public class StarPlus {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//
//        //condition check...
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                if(i % 2 == 1){
//                    if(j % 2 == 1){
//                        System.out.print(1 + " ");
//                    }else
//                        System.out.print(0 + " ");
//
//                }
//                else{
//                    if(j % 2 == 0){
//                        System.out.print(1 + " ");
//                    }else
//                        System.out.print(0 + " ");
//                }
////                    System.out.print("" + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//

//2nd type...........

import java.util.Scanner;

public class BinaryTrangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n");
            int n = sc.nextInt();

            //condition check...
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if((i+j)% 2 == 0){
                        System.out.print(1 + " ");
                    }else System.out.print(0 + " ");
                }
                System.out.println();
            }
        }
    }

