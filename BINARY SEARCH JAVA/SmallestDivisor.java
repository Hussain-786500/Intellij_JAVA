package com.binarySearchjava;

// Q1. Find the smallest Divisor given a threshold
public class SmallestDivisor {
    public static int smallestSearch(int[] arr,int t){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;

//        find max element;
        for(int x : arr){
            hi = Math.max(hi, x);
        }
        int ans = hi;

//        Binary search
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            int sum = 0;

            for(int x : arr){

//                ceil (x /mid)
                sum += (x + mid -1)/mid;
            }
            if(sum <= t){
                ans = mid;
                hi = mid -1;
            }else{
                lo = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 5, 9};
        int t = 6;

        int res = smallestSearch(arr, t);
        System.out.println("smallest Divisor: " + res);
    }
}