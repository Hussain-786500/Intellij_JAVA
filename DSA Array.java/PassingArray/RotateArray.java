package com.PassingArray;

// Q1. Rotate the given array 'a' by K  steps, where K is non-negative. without extra array
public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;

        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
    static void reverse(int[] arr, int i, int j){
        while (i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }

}
}