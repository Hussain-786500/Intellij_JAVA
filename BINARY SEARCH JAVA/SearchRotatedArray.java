package com.binarySearchjava;

public class SearchRotatedArray {

//    ----- search function ----
    public static int search(int[] arr, int x) {
    int lo = 0, hi = arr.length-1;

    while (lo <= hi){
        int mid = lo + (hi - lo)/2;

//        ----- find mid -----

        if(arr[mid] == x){
            return mid;
        }

//        ----- left side sorted -----

        if(arr[lo] <= arr[mid]){
            if(x >= arr[lo] && x < arr[mid]){
                hi = mid - 1;
            }else{
                lo = mid +1;
            }
        }

//        ----- right side sorted -----

        else{
            if(x > arr[mid] && x <= arr[hi]){
                lo = mid +1;
            }else{
                hi = mid -1;
            }
        }
    }
    return -1;
    }

//    ----- main function -----

    public static void main(String[] args){
      int[] arr = {4,5,6,7,0,1,2};
      int n = arr.length;
      int x = 0;

      int res = search(arr, x);
        System.out.println("index :" + res);
    }
}
