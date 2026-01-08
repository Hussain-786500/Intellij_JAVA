package com.binarySearchjava;

import java.util.*;
public class FindClosestEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int k = 2;

        int n = arr.length;

        // lower bound
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        int left = lo - 1;
        int right = lo;


        List<Integer> ans = new ArrayList<>();

        while (k > 0) {
            if (left < 0) {
                ans.add(arr[right++]);
            } else if (right >= n) {
                ans.add(arr[left--]);
            } else if (Math.abs(arr[left] - target) <= Math.abs(arr[right] - target)){
                ans.add(arr[right ++]);
            }
            else{
                ans.add(arr[right++]);
            }
            k--;
        }
        Collections.sort(ans);
        System.out.println("closest : " + ans);
    }
}

