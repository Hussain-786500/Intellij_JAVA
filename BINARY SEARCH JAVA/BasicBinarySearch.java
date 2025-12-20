package com.binarySearchjava;

//linear search-------

import java.util.*;
//public class BasicBinarySearch {
//    public static void main(String[] args) {
//        int x = 5;
//        int[] arr = {2, 6, 4, 9, 1, 5, 7};
////        int x = 5;
//        int n = arr.length;
//        boolean flag = false;
//
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == x) {
//                flag = true;
//                break;
//            }
//        }
//        if(flag == true)
//            System.out.println("element found: ");
//        else
//            System.out.println("element not found: ");
//    }
//}

//    Binary search-----
public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11}; // sorted array
        int x = 9;

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        boolean flag = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                flag = true;
                break;
            }
              else if (arr[mid] < x) low = mid + 1;
              else if (arr[mid] > x) high = mid - 1;
        }
            if (flag)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
