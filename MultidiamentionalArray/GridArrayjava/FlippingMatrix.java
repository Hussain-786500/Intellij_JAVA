package com.GridArrayjava;

import java.util.Scanner;

public class FlippingMatrix {
//    ******* Method to print flip matrix *******
public static void printMatrix(int[][] arr, String msg) {
    System.out.println("\n" + msg);
    for (int[] row : arr) {
        for (int x : row) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

    public static int flip(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        printMatrix(arr, "Step 1: Original matrix");

//   ----- make first cols all 1 -----
        for (int i = 0; i < n; i++) {
            if(arr[i][0] == 0) {    //flip that row
                for (int j = 0; j < m; j++) {
                    if(arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j]= 0;
                }
            }
        }

        printMatrix(arr, "step 2: After row flip");
//   ----- flip columns where 0s > 1s -----
        for (int j = 0; j < n; j++) {
            int zero = 0;
            int one = 0;
            for (int i = 0; i < m; i++) {
                if(arr[i][j] == 0) zero++;
                else  one++;
            }
            if(zero > one){
                for (int i = 0; i < m; i++) {
                    if(arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }
        printMatrix(arr, "step 3: After column flip");
//        ------- calculate final score -------
        printMatrix(arr, "step 4: Final Matrix before scoring");
        int score = 0;
        int x = 1;

        for (int j = n-1; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j] * x);
            }
            x *= 2;
        }
        return score;
    }
//    ******* Main method of flipping *******
    public static void main(String[] args) {

//        ------ take input from user -----
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row:");
        int m = sc.nextInt();

        System.out.println("Enter columns:");
        int n = sc.nextInt();

//        ----- create new variable for store -----
        int[][] arr = new int[m][n];

        System.out.println("Enter Matrix (0 and 1):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
     int result = flip(arr);
        System.out.println("final score = " + result);

    }

}
