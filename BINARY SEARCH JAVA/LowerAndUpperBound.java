package com.binarySearchjava;

//Q1. Given a sorted Integer array and an Integer 'X', find the lower bound of x.

public class LowerAndUpperBound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int ans = n;
        int x = 80;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println("Lower Bound: " + ans);
    }
}