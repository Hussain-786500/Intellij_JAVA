package com.mergequicksorting;

import java.util.Random;

public class RandomQuickSort {
//    --- print function ---
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//    --- swap function ---
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//    --- partition function ---
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];   // last element
        int i = low -1;         // index of smaller element

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
//        place pivot at correct position
        swap(arr, i+1, high);
        return i+1;
    }
//    --- randomized function ---
    public static int randomized(int[] arr, int low , int high){
        Random rand = new Random();
        int randomIndex = low + rand.nextInt(high - low + 1);
        swap(arr, randomIndex, high);
        return partition(arr, low, high);
    }
//     --- quick sort function ---
    public static void quicksort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);

//            Recursively sort left and right parts
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static void main(String[] args){
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        print(arr);
        quicksort(arr, 0, n-1);
        print(arr);
    }
}
