package com.sortingAlgorithmjava;

//Q-> Q14. Find the minimum operations required to sort the array in increasing order. In one operation ,you can
//set each occurrence of one element to 0.

import java.util.*;
public class GreedyLIS {
    //     ---- Function to find LIS length ----
        public static int LIS(int[] arr) {
     int n = arr.length;
     int[] dp = new int[n];
     Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int maxLen = 0;
        for(int len : dp){
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
        }

//      ---- Function to find minimum operations ----
        public static int minOperations(int[] arr){
        Set<Integer> unique = new HashSet<>();
        for(int val : arr) unique.add(val);

        int lisLength = LIS(arr);
        return unique.size() - lisLength;
        }

//         ----- Main Function -----
        public static void main (String[]args){
            int[] arr = {2, 3, 2, 1};

//            Minimum operations print....
            System.out.println("Minimum operations: " + minOperations(arr));
        }
    }
