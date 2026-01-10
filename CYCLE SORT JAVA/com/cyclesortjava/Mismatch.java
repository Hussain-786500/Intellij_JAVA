package com.cyclesortjava;

import java.util.Arrays;

public class Mismatch {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] mismatch(int[] arr){
        int n = arr.length;

      boolean[] b = new boolean[n+1];
      int[] res = new int[2];        // duplicate, missing

//        find duplicate----
        for(int ele : arr){
            if(b[ele]) res[0] = ele;
            else b[ele] = true;
        }

//        find missing----
        for (int i = 1; i <= n; i++) {
            if(b[i] == false){
                res[1] = i;
                break;
            }
        }
        return res;
        }
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 4};

        print(arr);
        System.out.println(Arrays.toString(mismatch(arr)));
    }
}
