package com.binarySearchjava;

//Q-> Kth Missing Positive Number

public class KthMissing {
//    ---- find missing function ----
    public static int findMissing(int[] arr,int k){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;

//        ---- Binary Search ----
        while (lo < hi){
            int mid = lo+(hi - lo)/2;

//        ---- Missing numbers till index mid ----
            int missing = arr[mid] - (mid +1);

            if(missing < k){
                lo = mid + 1;
            }else{
                hi = mid -1;
            }
        }
        return lo + k;
    }
//    ---- Main Function ----
   public static void main(String[] args){

       int[] arr = {2,3,4,7,11};
       int k = 365;

       int res = findMissing(arr, k);
       System.out.println("missing Num: " + res);
    }
}
