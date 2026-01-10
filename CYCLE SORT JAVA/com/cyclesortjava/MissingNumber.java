package com.cyclesortjava;

//              ------- for (0 to n) -------

//public class MissingNumber {
//    public static void print(int[] arr){
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//    public static void swap(int i, int j, int[] arr){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static int missingNumber(int[] arr){
//     int n = arr.length;
//     int i = 0;
//
//     while (i < n){
//         if(arr[i] == i || arr[i] == n)i++;
//         else{
//             swap(i, arr[i], arr);
//         }
//     }
//        for (int j = 0; j < n; j++) {
//            if( arr[j] != j)return j;
//        }
//        return n;
//    }
//    public static void main(String[] args){
//        int[] arr = {0, 1, 2, 7, 4, 5, 6};
//
//        print(arr);
//        System.out.println("Missing Number " + missingNumber(arr));
//    }
//}


//             ------- for (1 to n) -------

public class MissingNumber {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int ele = arr[i];

            if (ele >= 1 && ele <= n && arr[i] != arr[ele - 1]) {
             swap(i, ele -1, arr);
            }else i++;
        }

//         find missing -----
        for (int j = 0; j < n; j++) {
            if(arr[j] != j+1) return j+1;
        }
        return n +1;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 7, 4, 5, 6};

        print(arr);
        System.out.println("Missing Number " + missingNumber(arr));
    }
}
