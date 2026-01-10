package com.cyclesortjava;

//    Q-> Find the duplicate number.....

public class DuplicateNumber {
    public static void print(int[]arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int i, int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int duplicate(int[] arr){
        int n = arr.length;

        while (true){
            int ele = arr[0];
            if(arr[ele] == ele) return ele;
            swap(0, ele, arr);
        }
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 4, 2, 1, 6, 2};

        print(arr);
        System.out.println(duplicate(arr));
    }
}
