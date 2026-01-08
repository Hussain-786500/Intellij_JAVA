package com.mergequicksorting;

public class KthSmallest {
    static int ans;
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
//    ---- partition function ----
    public static int partition(int[] arr, int lo , int hi){
        int pivot = arr[hi];   // last element
        int i = lo -1;         // index of smaller element

        for (int j = lo; j < hi;j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
//        place pivot at correct position
        swap(arr, i+1, hi);
        return i+1;
    }
//    ---- quicksort function ----
    public static void quicSelect(int[] arr, int lo, int hi, int k){
        if(lo > hi) return;
        if(lo == hi){
            if(lo == k-1) ans = arr[lo];
            return;
        }
        int pi = partition(arr, lo, hi);
        if(pi == k-1){
            ans = arr[pi];
            return;
        }
//        Recursively sort left and right parts
        if(k-1 < pi) quicSelect(arr, lo, pi-1, k);
        else quicSelect(arr, pi-1, hi, k);
    }
    public static void main(String[] args){
        int[] arr = {4, 9, 1, 2, 6, 5, 8};
        int n = arr.length;

        print(arr);
        int k = 3;
        ans = -1;
        quicSelect(arr, 0, n-1,k);
        System.out.println(ans);
    }
}
