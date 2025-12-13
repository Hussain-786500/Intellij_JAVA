package com.sortingAlgorithmjava;

//Q-> Given an array of digits (values are from 0 to 9), the task is
// to find the minimum possible sum of two numbers formed from digits
// of the array. Please note that all digits of the given array must
// be used to form the two numbers.

public class DigitSorting {
//       ---- print function ----
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

//      ---- minSum Function ----
    public static void minSum(int[] arr){
        int n = arr.length;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                 num1 = num1 * 10 + arr[i];
            }else {
                num2 = num2 * 10 + arr[i];
            }
        }
        System.out.print("minSum: " + (num1 + num2));
    }

//     ---- Sorted function ----
    public static void main(String[] args){

//        --- main array ---
        int[] arr = {6, 8, 4, 5, 2, 3};
        int n = arr.length;

        print(arr);

//        --- bubble sort ---
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
        minSum(arr);
    }
}
