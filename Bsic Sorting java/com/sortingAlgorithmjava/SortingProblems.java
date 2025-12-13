package com.sortingAlgorithmjava;

//Q1. Find majority elements.

import java.util.Arrays;
//public class SortingProblems {
//
//      ---- print function ----
//    public static void print(int[] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 2, 1, 1, 1, 2, 2};
//        int n = arr.length;
//
//        print(arr);
//
//        for (int x = 0; x < n-1; x++) {
//            for (int i = 0; i < n-1 - x; i++) {
//                if(arr[i] > arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
//        print(arr);
//
//       find majority element
//
//        int candidate = arr[n/2];
//        System.out.println("Majority ele: " + candidate);
//    }
//}


//Q2. Given an array with N distinct elements, convert the given array
// to a form from 0 to n-1. The order of elements is the same, i.e.,
// 0 is placed in the place of the smallest element,
// 1 is placed for the Second - smallest element ...n-1 is placed the
// largest elements.(this is trnas form array)....
//
//public class SortingProblems {
////      --- print function -----
//    public static void print(int[]arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//
//        int[] arr = {40, 12, 78, 34, 100, 57, 23};
////   final ans look {3,  0,  5,  2,  6,   4,  1 }
//        int n = arr.length;
//        print(arr);
//        int x = 0;
//
////        ----- loop function -----
//        for (int i = 0; i < n; i++) {
//            int min = Integer.MAX_VALUE;
//            int mindx = -1;
//            for (int j = 0; j < n; j++) {
//                if(arr[j] < min && arr[j] > 0){
//                    min = arr[j];
//                    mindx = j;
//                }
//            }
//            arr[mindx] = x;
//            x--;
//        }
//        print(arr);
//        for (int i = 0; i < n; i++) {
//            arr[i] *= (-1);
//        }
//        print(arr);
//    }
//}

//    Q3. Given an integer array and an integer k where k<=size of array,
//    We need to return the kth smallest element of the array.

public class SortingProblems {
//      --- print function ---
    public static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {2, 6, 4, 8, 1, 5};
        int n = arr.length;
        int k = 3;

        System.out.println("Original arr: ");
        print(arr);

        for (int x = 0; x < n-1; x++) {
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i] > arr[i +1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("Sorted arr: ");
        print(arr);
//        kth smallest element
        System.out.println(k + "th smallest element: " + arr[k-1]);
    }
}