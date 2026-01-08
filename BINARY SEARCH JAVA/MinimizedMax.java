package com.binarySearchjava;
//Q-> Minimized maximum of products distributed to any store.

public class MinimizedMax {

//        ----- Main Function -----
    public static int MinimizedMax(int n, int[] arr) {
        int lo = 1, hi = 0;

        for(int w : arr){
            hi = Math.max(hi, w);
        }
        while (lo < hi){
            int mid = lo+(hi-lo)/2;
            int stores = 0;

            for(int w : arr){

                stores += (w + mid -1)/mid;     //ceil division
                if(stores <= n){
                    hi = mid;                  // possible try smaller
                }else{
                    lo = mid +1;                // not possible increase
                }
            }
        }
        return lo;
    }

//     ----- divisor function -----
public static void main(String[] args) {
    int[] arr = {11, 6};
    int n = 6;

    int res = MinimizedMax(n, arr);
    System.out.println("return :" + res);
   }
}
