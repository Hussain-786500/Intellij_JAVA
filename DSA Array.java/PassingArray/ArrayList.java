package com.PassingArray;

//import java.util.Arrays;
//
//public class ArrayList {
//    public static void main(String[] args){
//        int[]arr = {23, 67, 10, 8, 16, 90, 34};
//
//        //for each loop.....
//
//        for(int x : arr){
//            System.out.print(x + " ");
//        }
//        Arrays.sort(arr);
//
//        System.out.println();
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//    }
//}


// ** Copy element............

//1). shallow copy.....
//
//public class ArrayList {
//    public static void main(String[] args){
//        int[]arr = {23, 56, 78, 89, 90, 23, 20};
//
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        int[] nums = arr;
//
////        if i change value.......
//        nums[0] = 80;
//        System.out.println(arr[0]);   // Now will be change value but  original arr value change
//
////          copy condition.....
//
////        for(int i = 0; i < nums.length; i++){
//           System.out.print(nums[i] + " ");

import java.util.Arrays;

////        }
//    }
//}
//

// Deep Copy.......
//
public class ArrayList {
    public static void main(String[] args){

        int[] arr = {34, 56, 89, 90, 30, 20};

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[]nums = arr;

        //if i change value.....

        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 50;   // Now will be change value but Not original arr value change

        System.out.println(arr[0]);
    }
}