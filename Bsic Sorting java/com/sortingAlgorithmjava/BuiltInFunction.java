package com.sortingAlgorithmjava;

import java.util.Arrays;

public class BuiltInFunction {
    public static void main(String[] args){
        int[] arr = {4, 2, 6, 7, 5};
         for(int ele : arr){
             System.out.print(ele + " ");
         }
        System.out.println();       //next line

        Arrays.sort(arr);           // BuiltIn function
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
