package com.PassingArray;

public class ArraytToMethods {
    public static void main(String[] args) {

        int[] arr = {10, 67, 56, 34, 22};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);

    }
public static void change(int[] x){
        x[0] = 80;
}
}
