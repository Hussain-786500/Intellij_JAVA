package com.sortingAlgorithmjava;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

//Q1. Sort a given array in decreasing order using bubble sort.
//
//public class SelectionSort {
//
////     ---- PRINT ARRAY ----
//    public static void print(int[] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
////      ---- SWAPE FUNCTION ----
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static void main(String[] args){
//        int[] arr = {10, -4, 20, 1, -6, 8};             // not sorted
//        int n = arr.length;
//
//        print(arr);
//
////         selection sort
//        for (int i = 0; i < n-1; i++) {
//            int min = Integer.MAX_VALUE;
//            int mindx = i;
//
////            find actual smallest in remaining array
//            for (int j = i; j < n ; j++) {
//                if(arr[j] > arr[mindx]){
//                    mindx = j;
//                }
//            }
//            swap(arr, i, mindx);
//        }
//        print(arr);
//      }
//  }
//


// Q2. Sort a given array in increasing order using selection sort,
// But in each pass, put the 'kth' maximum element at the right
// position.

public class SelectionSort {
//      ---- print Function ----
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

//     ---- Swap Function ----
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {10, -4, 20, 1, -6, 8};
        int n = arr.length;
        print(arr);

//      In each pass, put the k-th maximum (largest remaining)
//      to the right side
        for (int k = 0; k < n-1; k++) {
            int mindex = 0;

//      find maximum in unsorted part [0 .. n-1-k]
            for (int j = 1; j < n-k; j++) {
                if(arr[j] > arr[mindex]){
                    mindex = j;
                }
            }
//      swap maximum with (n-1-k) position
            swap(arr, mindex, n-1-k);
        }
        print(arr);
    }
}