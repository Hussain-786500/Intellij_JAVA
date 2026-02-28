package com.Recursion.java;

//      ------- Array Traverse -------

//public class ArrayTraverse {
//    public static void print(int i, int[] arr){
//        if(i == arr.length) return;         // Base case
//        System.out.print(arr[i] + " ");
//        print(i+1, arr);
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 4, 8, 6, 0, 7, 1, 3};
//
//        print(0, arr);
//    }
//}


//         -------- String Traverse --------

public class ArrayTraverse {
    public static void print(int i, String s){
        if(i == s.length())return;        // Base Case
        System.out.print(s.charAt(i));
        print(i+1, s);
    }
    public static void main(String[] args){

        String s = "Zero Alpha";
        print(0,s);
    }
}