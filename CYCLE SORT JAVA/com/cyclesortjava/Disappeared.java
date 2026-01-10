package com.cyclesortjava;
//   Q-> Find all the numbers disappeared in an array.
//   leetcode   448

import java.util.ArrayList;
public class Disappeared {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static ArrayList<Integer> disappeared(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int ele = arr[i];

            if (arr[i] == i + 1 || arr[i] == arr[ele - 1]) i++;
            else {
                swap(i, ele - 1, arr);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if(arr[j] != j+1) ans.add(j+ 1);
        }
        return ans;
    }

    public static void main(String[] args){
   int[] arr = {4, 3, 2, 7, 8, 2, 3, 7};
   int n = arr.length;

   print(arr);

        System.out.println(disappeared(arr));

    }
}
