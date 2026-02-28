package com.Recursion.java;

//    Q-> Print (N to 1) using print method.
//public class PrintNtoOne {
//    public static void print(int n) {
//
//        if (n == 0) return ;        //  Base case........
//
//        System.out.println(n);      //  print first..........
//
//        print(n - 1);              //  Recursive call.......
//    }
//    public static void main(String[] args){
//
////        ------ for recursive -----
//        int n = 5;
//        print(n);
//
//       ------- for ForLoop ------
//        int n = 5;
//        for (int i = n; i >= 1; i--) {
//            System.out.println(i);
//        }

//    Q-> Print (N to 1) using print method.
        public class PrintNtoOne {
            public static void print(int n) {

                if (n == 0) return ;        //  Base case........

                print(n - 1);              //  Recursive call.......

                System.out.println(n);      //  print first..........
            }
            public static void main(String[] args){

//        ------ for recursive -----
                int n = 5;
                print(n);


            }
}
