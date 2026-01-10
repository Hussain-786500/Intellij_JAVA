package com.cyclesortjava;

import java.util.HashSet;
import java.util.Set;

// 1) for HasSet solve
//public class MissingPositive {
//    public static void print(int[] arr) {
//        for (int ele : arr) {
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//    }
//
//    public static void swap(int i, int j, int[] arr) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static int missing(int[] arr) {
//        int n = arr.length;
//        Set<Integer> set = new HashSet<>();
//        for(int ele : arr){
//            set.add(ele);
//        }
//        for (int i = 0; i < n; i++) {
//            if(!set.contains(i)) return i;
//        }
//        return 784;
//    }
//
//    public static void main(String[] args){
//     int[] arr = {0, 1, 2, 7, 4, 5, 6};
//
//     print(arr);
//        System.out.println(missing(arr));
//    }
//}


// for cycle function solve

public class MissingPositive {
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

    public static int missing(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int ele = arr[i];
            if (ele <= 0 || ele == i + 1 || ele > n || ele == arr[ele - 1]) i++;
            else {
                swap(i, ele - 1, arr);
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) return j + 1;
        }
        return 1;
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 2, 7, 4, 5, 6};

        print(arr);
        System.out.println(missing(arr));

       }
    }
