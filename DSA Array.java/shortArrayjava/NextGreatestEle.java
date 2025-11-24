package com.shortArrayjava;

//Q1. Next greatest element.

//method 1...

public class NextGreatestEle {
    public static void main(String[] args){
        int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;   // nothing element of last right side

        //condition check...

        for(int i = 0; i < n-1; i++){
            int mx = Integer.MIN_VALUE;  //find 2nd greatest number
        for(int j = i + 1; j < n; j++){
            mx = Math.max(mx, arr[j]);
        }
        ans[i] = mx;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}

//method 2.reverse...
//public class NextGreatestEle {
//    public static void main(String[] args){
//
//        int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
//        int n = arr.length;
//        int[] ans = new int[n];
//        ans[n-1] = -1;
//
////        condition check...
//
//        int nge = arr[n-1];
//        for(int i = n-2; i >= 0; i--){
//            ans[i] = nge;
//            nge = Math.max(nge, arr[i]);
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        for(int ele : ans){
//            System.out.print(ele + " ");
//        }
//
//    }
//}



// found reverse number.
//
//public class NextGreatestEle {
//    public static void main(String[] args){
//        int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
//        int n = arr.length;
//        int[] ans = new int[n];
//        ans[0] = -1;
//
//        //condition check...
//
//        for(int i = 1; i < n; i++){
//            int mx = Integer.MIN_VALUE;
//
//        for(int j = i - 1; j >= 0; j--){
//            mx = Math.max(mx, arr[j]);
//        }
//        ans[i] = mx;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        for(int ele : ans){
//            System.out.print(ele + " ");
//        }
//    }
//}

//Q1. Next smallest element.
//
//public class NextGreatestEle {
//    public static void main(String[] args){
//        int[] arr = {12, 8, 60, 37, 2, 49, 16, 28, 21};
//        int n = arr.length;
//        int[] ans = new int[n];
//        ans[n-1] = -1;
//
//        //condition check....
//
//        for(int i = 0; i < n - 1; i++){
//             int mn = Integer.MAX_VALUE;
//        for(int j = i + 1; j < n; j++){
//            mn = Math.min(mn, arr[j]);
//        }
//        ans[i] = mn;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        for(int ele : ans){
//            System.out.print(ele + " ");
//        }
//    }
//}
