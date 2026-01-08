package com.binarySearchjava;

//Q Capacity to ship packages within D days
public class BinarySearchAns {
//        ------ Main Function -----
    public static int shipWithinDays(int[] arr, int days) {
        int lo = 0;
        int hi = 0;

        for(int w : arr){
            lo = Math.max(lo, w);
            hi += w;
        }

//        ------ Binary Search -----
        while (lo < hi){
            int mid = lo+ (hi-lo)/2;

            if(canShip(arr, days, mid)){
                hi = mid;
            }else{
                lo = mid +1;
            }
        }
        return lo;
    }
//       ------ Helper Function ------
    public static boolean canShip(int[]arr, int days, int C){
        int currLad = 0;
        int reqDays = 1;

        for(int w : arr){
            if(currLad + w > C){
                reqDays++;
                currLad = 0;
            }
            currLad += w;
        }
        return reqDays <= days;
    }

//       ------ Driver code  function ------
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int days = 5;

        int res = shipWithinDays(arr, days);
            System.out.println("Minimum Capacity required: " + res);
    }
}
