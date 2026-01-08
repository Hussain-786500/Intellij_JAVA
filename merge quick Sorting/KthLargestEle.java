package com.mergequicksorting;

public class KthLargestEle {
    static int ans;
//    --- print function ---
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//    --- swape function ---
    public static void swape(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//    --- partition function ---
    public static int partition(int[] arr, int lo , int hi){
        int pivot = arr[hi];   // last element
        int i = lo -1;         // index of smaller element

        for (int j = lo; j < hi; j++) {
            if(arr[j] < pivot){
                i++;
                swape(arr, i, j);
            }
        }
//        place pivot at correct position
        swape(arr, i+1, hi);
        return i+1;
    }
//    --- quickSelect function ---
    public static void quickSelect(int[] arr, int lo, int hi, int k){
        if(lo > hi)return;
        if(lo == hi){
            if(lo == k-1) ans = arr[lo];
            return;
        }
//        Recursively sort left and right parts
        int pi = partition(arr, lo, hi);
        if(k-1 < pi) quickSelect(arr, lo, pi-1, k);
        else quickSelect(arr, pi+1, hi, k);
    }
//    --- main function ---
    public static void main(String[] args){
        int[] arr = {4, 9, 1, 2, 6, 5, 8};
        int n = arr.length;

        print(arr);
        int k = 3;
        ans = -1;
        quickSelect(arr, 0, n-1, n-k+1);
        System.out.println(ans);
    }
}
