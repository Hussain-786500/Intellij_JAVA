package com.BasicArrayofDSA;
//

//Normal way...take value...........

//public class BasicArray {
//    public static void main(String[] args){
//        int [] arr = new int[3];
//
//        //initialising individual element.........
//        arr[0] = 89;
//        arr[1] = 88;
//        arr[2] = 78;
//
//        //output of array element..............
//
//        System.out.print(arr[1] + " ");
//
//        //Update / modify........
//
//        arr[1] = 100;
//        arr[1] += 10;        // adding value
//        System.out.println(arr[1]);
//    }
//}


//Efficient way for take value............
//
//public class BasicArray {
//    public static void main(String[] args){
//
//        //initialisation individual element.........
//        int[] arr = new int[5];
//
//        arr[0] = 92;
//        arr[1] = 98;
//        arr[2] = 55;
//        arr[3] = 90;
//        arr[4] = 54;
//
//        //output.....for loop........
//
//        for(int i = 0; i <= 4; i++){
//            System.out.println(arr[i] + " ");
//        }
//    }
//}
//****


// Efficient way for take value.....with scanner.......

import java.util.Scanner;
public class BasicArray {
    public static void main(String[] args){

        //input value.........

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre your input");

        int[] arr = new int[5];

        //initialisation individual element.........
        //input..........
        for(int i = 0; i <= 4; i++){
            arr[i] = sc.nextInt();
        }
      //output.........
        for(int i = 0; i <= 4; i++){
            System.out.print(" output: " + arr[i] + " ");
            System.out.println(arr[i] + " ");
        }
    }
}
//******

//length operator.........
//
//public class BasicArray {
//   public static void main(String[] args) {
//       int[] arr = {23, 56, 89, 67, 90, 56, 78, 56};
//       int n = arr.length;
//       System.out.println("length: " + n );
//
//       //corrected for loop.........
//
//       for(int i = 0; i < n; i++){
//           System.out.println(arr[i] + " ");
//       }
//     }
//   }

