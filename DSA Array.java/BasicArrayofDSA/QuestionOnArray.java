package com.BasicArrayofDSA;

//Q1.  Given an array of marks of students, if the mark of any student
// is less than 35 print its roll number. [roll number]
// here refers to the index of the array.

//public class QuestionOnArray {
//public static void main(String[] args){
//
//    int[] arr = {56, 27, 89, 17, 90,25,98};
//    int n = arr.length;

//    // lop condition

//    for(int i = 0; i < n; i++){
//    if(arr[i]<35)
//        System.out.print(i + " ");
//    }
//   }
//}

// Q2.Are the following array declaration correct?

//i). int a (25); ----correct this----> int[] a ;
//2). int c = {0,1,2}; -----this correct----> int[] c = {0, 1, 2, 3,4};

//Q3.Calculate the sum of all the elements n the given array.

//public class QuestionOnArray {
//    public static void main(String[] args){
//
//        int[] arr = {56,78,45,23,89,90,60,50,65,92,89,65,54,40,80, 85,};
//        int sum = 0;
//
//        //loop condition......
//
//        for(int i = 0; i < arr.length; i++){
//             sum += arr[i];
//        }
//        System.out.println("total number of sum: " + sum);
//    }
//}

//Q4. Find the element 'X' in the array. Take array and X as input.(linear search question).
//
//import java.util.Scanner;
//public class QuestionOnArray {
//    public static void main(String[] args) {
//
//        //take input .....
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter target element : ");
//        int x = sc.nextInt();
//        System.out.print("Enter Array size : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter Array element : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        //solution..........
//        boolean flag = false;  // false means not found
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == x) {
//                flag = true; // true means found
//                break;
//            }
//        }
//        if(flag==true)
//            System.out.println("Element found");
//        else System.out.println("Element not found");
//    }
//}

//Q5. Find the maximum value out of all the elements in the array.
//1st method..........(FOR FIND MAX VALUE)....
//
//public class QuestionOnArray {
//    public static void main(String[] args){
//
//        int[] arr = {12, 56, 78, 34, 100};
//        int max = arr[0];
//        int n = arr.length;
//
//        for(int i = 1; i < n; i++){
//            if(arr[i] > max) max = arr[i];
//        }
//        System.out.println(max);
//    }
//}

//2nd method.............
//
//public class QuestionOnArray {
//    public static void main(String[] args) {
//
//        int [] arr = {12, 56, 78, 45, 67};
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] > max) max = arr[i];
//            max = Math.max(max, arr[i]);
//        }
//        System.out.println(max);
//    }
//}

//1st method..........(FOR FIND MIN VALUE)....

//public class QuestionOnArray {
//    public static void main(String[] args){
//
//        int[] arr = {12, 56, 78, 34, 100, 6};
//        int min = arr[0];
//        int n = arr.length;
//
//        for(int i = 1; i < n; i++){
//            if(arr[i] < min) min = arr[i];
//        }
//        System.out.println(min);
//    }
//}

//2nd method.............

//public class QuestionOnArray {
//    public static void main(String[] args){
//
//        int[] arr = {12, 55,45,78,23,5,10};
//        int min = Integer.MAX_VALUE;
//        int n = arr.length;
//
//        //loop condition....
//
//        for(int i = 1; i < n ; i++){
//          if (arr[i] < min) min = arr[i];
//            min = Math.min(min,arr[i]);
//        }
//        System.out.println(min);
//    }
//}


//Q6. Find the second largest element in the given array.

//find 2nd largest number....

//public class QuestionOnArray {
//    public static void main(String[] args){
//
//        int[] arr = {12, 10, 32, 67, 89, 90, 100};
//        int mx = Integer.MIN_VALUE;
//        int n = arr.length;
//
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] > mx) mx = arr[i];
//        }
//        int smx = Integer.MIN_VALUE;
//        for(int i = 0; i < n; i++){
//            if(arr[i] != mx)
//                smx = Math.max(smx,arr[i]);
//        }
//        System.out.println(mx);
//        System.out.println(smx);
//    }
//}

//find second smallest number........
//
public class QuestionOnArray {
    public static void main(String[] args){

        int[]arr = {12, 56, 78, 90, 23, 40, 6};
        int min = arr[0];
        int n = arr.length;


        for(int i = 0; i < n; i++){
            if(arr[i] < min) min = arr[i];
        }
        int smn = arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] != min)
                smn = Math.min(smn,arr[i]);
        }
        System.out.println(min);
        System.out.println(smn);
    }
}