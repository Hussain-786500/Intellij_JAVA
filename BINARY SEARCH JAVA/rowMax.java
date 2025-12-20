package com.binarySearchjava;

public class rowMax {
//       --- Binary function ---
    public static int countOnes(int[]arr){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int ans = -1;

        while (lo <= hi){
            int mid = lo+(hi -lo)/2;

            if(arr[mid] == 1){
                ans = mid;
                hi = mid -1;
            }else if (arr[mid] < -1){
                lo = mid +1;
            }else {
                lo = mid +1;
            }
        }
        if(ans == -1) return 0;
        return n-ans;
    }

//       ---- max function ----
    public static int maximum(int[][] arr){
        int n = arr.length;
        int maxRow = -1;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int count = countOnes(arr[i]);

            if(count > maxCount){
                maxCount = count;
                maxRow = i;
            }
        }
        return maxRow;
    }

//       ---- Main function ----
    public static void main(String[] args){
        int[][] arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        System.out.println("row max: " + maximum(arr));

    }
}


