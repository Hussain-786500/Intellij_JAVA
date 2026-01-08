package com.mergequicksorting;

import com.sun.security.jgss.GSSUtil;

public class QuickSort {
//     ---- Print Function ----
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//    ---- Swap Function ----
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//     ---- Partition Function ----
    public static int partition(int[] arr, int low, int high){
      int pivot = arr[high];   // last element
       int smallercount = low -1;         // index of smaller element

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                smallercount++;
                swap(arr, smallercount, j);
            }
        }
//        place pivot at correct position
        swap(arr, smallercount+1, high);
        return smallercount+1;
    }
//    ---- Quick sort Function ----
    public static void quicksort(int[] arr, int low, int high){
       if(low < high){
           int pi = partition(arr, low, high);

//           Recursively sort left and right parts
           quicksort(arr, low, pi -1);
           quicksort(arr, pi + 1, high);
       }
    }
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};
        int n = arr.length;

        System.out.println("before sorting: ");
        print(arr);

        quicksort(arr,0, n-1);

        System.out.println("after sorting :");
        print(arr);
    }
}
