package com.binarySearchjava;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10}; // sorted array
        int x = 8;
        int n = arr.length;

        int fp = -1, lp = -1;

        // -------- Last Occurrence -------
        int low = 0, high = n - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == x){
                fp = mid;
                high = mid -1;
            }
            else if (arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }

        // -------- Last Occurrence --------
         low = 0;
        high = n - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == x){
                lp = mid;
                low = mid +1;
            }
            else if (arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        System.out.println("fp: " + fp);
        System.out.println("lp: " + lp);
    }
}
