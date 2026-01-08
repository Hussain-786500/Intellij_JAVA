package com.mergequicksorting;

public class InversionCount {
    static int count;
//     ---- Print Function ----
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//     ---- Inversion count Function ----
//    public static void inversion(int[] a, int[] b){
//        int i = 0, j = 0;
//
//        while (i < a.length && j < b.length){
//            if(a[i] > b[j]){
//                count+= (a.length -i);
//                j++;
//            }
//            else i++;
//        }
//    }
//     ---- Merge Function ----
    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k++] = a[i++];
            }
            else {
                count = count + (a.length -i);   // inversion count
                c[k++] = b[j++];
            }
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
//     ---- mergesort Function ----
    public static void mergesort(int[] arr){
        int n = arr.length;

        if(n == 1)return;    // Base case

//     create two array (a, b)----
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

//     Copy pasting----
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        }
//     merging magic----
        mergesort(a);
        mergesort(b);
//        inversion(a, b);
//         merge these a, and b
        merge(a, b, arr);

//        delete a and b array
        a = null; b = null;
    }
//    ---- Main Function ----
    public static void main(String[] args){
        int[] arr = {8, 2, 3, 6, 5, 4, 1};
        int n = arr.length;

        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count );
    }
}

