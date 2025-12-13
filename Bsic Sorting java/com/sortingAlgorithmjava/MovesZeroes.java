package com.sortingAlgorithmjava;

//      ----- Set all 0 ele in last index ----
//              --- but not sorted ---
//
//public class MovesZeroes {
//    public static void print(int[] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//        int[] arr = {0, 1, 0, 3, 12, 24, 0, 6, 5};
//        int n = arr.length;
//
//        print(arr);
//        for (int x = 0; x <n-1 ; x++) {
//            for (int i = 0; i < n - 1 - x; i++) {
//                if (arr[i] == 0) {
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
//
//        print(arr);
//    }
//}

//      ----- Set all 0 ele in last index ----
//              --- but with sorted ---

public class MovesZeroes {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12, 24, 0, 6, 5};
        int  n = arr.length;
        print(arr);

        for (int x = 0; x < n-1; x++) {
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i] == 0){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
//     ---- sort only the non-zero element ----

//        int noz = 0;
//        while (noz < n && arr[noz] != 0){   //from while loop
//            noz++;
//        }
        int noz = 0;
        for (int i = 0; i < n; i++) {       // from for loop
            if(arr[i] == 0){
                noz = i;
                break;
            }
        }
//     ---- Bubble sort  non-zero position ----
        for (int x = 0; x < noz-1; x++) {
            for (int i = 0; i < noz-1-x; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);
    }
}