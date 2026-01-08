package com.sortingAlgorithmjava;

//public class BubbleSort {

//          ****** Normal sort pass ******
//
//    public static void print(int[]arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//
//        int[] arr = {5, 1, 3, 4, 2};             // not sorted
//        int n = arr.length;
//        print(arr);     // print array
//
//        for (int i = 0; i < n-1; i++) {
//            if(arr[i] > arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        print(arr);    // print array    , still output : Not sorted
//    }
//}


//       ****** Multiple swapping method ******
//          --- (But not efficient way) ---
//
//public class BubbleSort {
//public static void print(int[]arr){
//    for(int ele : arr){
//        System.out.print(ele + " ");
//    }
//    System.out.println();
//}
//public static void main(String[] args){
//
//    int[] arr = {5, 1, 3, 4, 2};             // not sorted
//    int n = arr.length;
//    print(arr);     // print array
//
////    Swapping, pass -1....
//    for (int i = 0; i < n-1; i++) {
//        if(arr[i] > arr[i+1]){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//    }
//
//    //    Swapping, pass -2....
//    for (int i = 0; i < n-1; i++) {
//        if(arr[i] > arr[i+1]){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//    }
//
//    //    Swapping, pass -3....
//    for (int i = 0; i < n-1; i++) {
//        if(arr[i] > arr[i+1]){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//    }
//    print(arr);    // print array    , Now output :is sorted (But not efficient way)
//}
//}


//        ****** This is Good way for sorted Array ******
//                --- And this is Bubble Sort ---

public class BubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 8, 1, 3, 8, 10};             // not sorted
        int n = arr.length;
        System.out.println("Original Array: ");
        print(arr);     // print array

        System.out.println();              // next line

        //    ---- Bubble sort- 1 ----
//        for(int x = 1; x <= n-1; x++){             // Bubble Sort
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//               }
//            }
//        }
//        System.out.println("Bubble Sort-1: ");
//        print(arr);                   //array print
//
//        //    ---- Bubble sort- 2 ----
//        for(int x = 1; x <= n-1; x++){             // Bubble Sort
//            for (int i = 0; i < n-1 - x; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        System.out.println("Bubble Sort-2");
//        print(arr);                // array print

        //    ---- Bubble sort-( Optimize - code ) ----
        for (int x = 1; x <= n - 1; x++) {             // Bubble Sort (n-1 Pass)
            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
                if (flag == true) break;
            }
            System.out.println("Bubble Sort Optimize:");
            print(arr);              // array print
        }
    }
