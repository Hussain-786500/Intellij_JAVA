package com.sortingAlgorithmjava;

public class InsertionSort {
//      ---- print function ----
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " " );
        }
        System.out.println();
    }

//    ----- swap function ----
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 1, 5, 3, 8};
        int n = arr.length;

        print(arr);

//        from for lop.....
//        Insertion sort
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j >= 1 && arr[j] < arr[j-1] ; j--) {
//                    swap(arr, j, j-1);
//                }
//            }
//        from while loop......
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 1 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
        print(arr);
        }
    }
