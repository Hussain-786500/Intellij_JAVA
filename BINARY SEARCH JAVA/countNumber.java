package com.binarySearchjava;
public class countNumber {
    public static int lastOccurrence(int[] arr) {
        int n = arr.length;
        int lo = 0, hi = arr.length - 1;
        int ans = -1;

       while (lo <= hi){
           int mid = lo+(hi - lo)/2;

           if(arr[mid] == 1){
               ans = mid;
               hi = mid -1;
           }else if (arr[mid] < -1){
               lo = mid +1;
           }else{
               lo = mid +1;
           }
       }
       if(ans == -1)return 0;
       return  n-ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1, 1};

            System.out.println("Total 1s = " + lastOccurrence(arr));
        }
    }
