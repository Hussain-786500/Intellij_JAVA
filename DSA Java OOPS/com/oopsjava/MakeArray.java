package com.oopsjava;

import java.util.ArrayList;
import java.util.Arrays;

// Q-> Make your own ArrayList
public class MakeArray{

//     ----- create arrayList class -----
    public static class ArrayList {
    int[] arr = new int[4];
    int idx = 0;
    int size = 0;

    public void add(int ele) {

// ---- this function is generate new arrayList, if initial ArrayList
//      complete now create new double type arrayList (like, initialize 4 now
//      After full create 8 ArrayList double). -----
        if (size == arr.length){
            int[] brr = Arrays.copyOf(arr, arr.length);
            arr = brr;
        }
        arr[idx] = ele;
        idx++;
        size++;
    }
//    ----- create set function -----
    public void set(int idx, int val){
        arr[idx] = val;
    }
}
    public static void main(String[] args){

//        ----- Normal array -----
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//
//        arr.set(1, 20);                 // value change of 1st index
//        System.out.println(arr.size());
//        System.out.println(arr);

//         --- take array of array class ----
        ArrayList arr = new ArrayList();
        arr.add(2);       // 1 ele
        arr.add(1);       // 1 ele
        arr.add(2);
        arr.add(8);
        System.out.println(arr.size);

        arr.set(0, 30);
        arr.set(1, 70);
        System.out.println(arr.size);

        }
    }

