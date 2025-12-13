package com.sortingAlgorithmjava;

import java.util.Arrays;

public class StringSort {
    public static void print(String[] arr){
        for(String ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        String[] arr = {"apple", "banana", "mango", "grape", "orange"};
        int n = arr.length;

        print(arr);

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
