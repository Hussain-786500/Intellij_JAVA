package com.PassingArray;



// Q2. Write a program to reverse the array without using any extra array.
//1ST METHOD..........
//
//public class TwoPointer {
//    public static void main(String[] args){
//        int[] arr = {10, 20, 30, 40, 50, 60};
//        int n = arr.length;
//
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//
//        //reverse solution........
//
//        for(int i = 0; i < n/2; i++){
//            int j = n -1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        for(int ele : arr){
//            System.out.print(ele+ " ");
//        }
//        System.out.println();
//
//    }
//}

//2ND METHOD............

    public class TwoPointer {
        public static void main(String[] args){

            int[] arr = {10, 20, 30, 40, 50, 60, 70};
            int n = arr.length;

            for(int ele : arr ){
                System.out.print(ele + " ");
            }
            System.out.println();

            //reverse condition........

            int i = 0, j = n - 1;   // full array reverse
//            int i = 0, j = 4;     // part of array reverse

            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; // move forward
                j--;  // move backward
            }
            for(int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

