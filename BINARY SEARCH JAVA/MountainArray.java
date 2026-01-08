package com.binarySearchjava;

public class MountainArray {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 7, 6, 4, 1};
        int n = arr.length;
        int lo = 1, hi = n-2;
        int p = -1;

      while (lo <= hi){
          int mid = lo+(hi - lo)/2;

          if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
              p = mid;
              break;
          }
          else if(arr[mid] > arr[mid-1] && arr[mid] <arr[mid+1]){
              lo = mid +1;
          }else{
              hi = mid -1;
          }
      }
        System.out.println("mountain index: " + p);
    }
}
