package com.shortArrayjava;

//  Q1. Short the array of 0s,1s, and 2s. (Dutch flag Algorithm) say in leet code, (short colors)

//1st method......

//public class short_0s1s2s {
//    public static void main(String[] args){
//        int[] arr = {1,1,0,2, 1, 0, 2, 1, 2,0,2,1};
//        int n = arr.length;
//
//        int zero = 0, one =0, two = 0;
//
//        //count occurrence...
//
//        for(int x : arr){
//            if(x == 0) zero++;
//            else if (x == 1) one++;
//            else two++;
//        }
//
//        //put 0s...
//        int i = 0;
//        while(zero-- > 0) arr[i++] = 0;
//
//        //put 1s...
//        while(one-- > 0) arr[i++] = 1;
//
//        //put 2s...
//        while(two-- > 0) arr[i++] = 2;
//
//        //print result...
//
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//    }
//}

//2nd method......

public class short_0s1s2s {
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 2, 1, 1, 0, 1, 2, 0, 0, 1, 0, 2, 1};
        int n = arr.length;

        int mid = 0, hi = n-1, low = 0;
        while(mid <= hi){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++; mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }

        //print result
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}