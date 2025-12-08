package com.stringdsajava;

//public class Substring {
//    public static void main(String[] args){
//
//        String str = "abcde";
//        System.out.println(str.substring(0,5));          //full print  abcde
//        System.out.println(str.substring(1));  //print  bcde
//        System.out.println(str.substring(2));  //print  cde
//        System.out.println(str.substring(1, 4));         //print  bcd / slice
//        System.out.println(str.substring(2,2));          //nothing print
//    }
//}
//
//


// Q1. Input a string and print all the substring of that string.

        public class Substring {
            public static void main(String[] args){

                String str = "abcde";
                int n = str.length();
                for (int i = 0; i < n; i++) {
                    for (int j = i+1; j <= 5 ; j++) {
                        System.out.print(str.substring(i,j) + " ");
                    }
                    System.out.println();
                }
            }
}
