package com.mergequicksorting;
// -> in this code ,the amount of space used = (n log n)
// -> Space Complexity = O(n log n)
// -> But after we can improve it : By deleted of (a, b) after merging into array

import java.util.Arrays;

public class TSCAlgorithm {
//     ----- Print Function -----
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//     ----- merge function -----
    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
//     ----- merge sort -----
    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n == 1) return;    // base case

//        create two array (a, b)
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

//         copy pasting...
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        }
//        sorting magic
        mergesort(a);
        mergesort(b);

//        merge these 'a' and 'b'.
        merge(a,b, arr);

//     After merge delete (a, b) these array for reduce extra space(save space, memory)
        a = null;
        b = null;     // improve space complexity = O(n)
    }
//      ----- Main function -----
    public static void main(String[] args){
     int[] arr = {2, 5, 3, 1, 8, 6, 4, 7};
     print(arr);
     mergesort(arr);
     print(arr);

    }
}
