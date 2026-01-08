package com.GridArrayjava;

import java.util.*;
public class SpiralSecond {
    public static void print(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n = sc.nextInt();

    int[][] matrix = new int [n][n];

    int left = 0, right = n - 1;
    int top = 0, bottom = n - 1;
    int num = 1;

    while (left <= right && top <= bottom) {

        // Left → Right
        for (int i = left; i <= right; i++) {
            matrix[top][i] = num++;
        }
        top++;

        // Top → Bottom
        for (int j = top; j <= bottom; j++) {
            matrix[j][right] = num++;
        }
        right--;

        // Right → Left
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
        }

        // Bottom → Top
        if (left <= right) {
            for (int j = bottom; j >= top; j--) {
                matrix[j][left] = num++;
            }
            left++;
        }
    }
     print(matrix);
    sc.close();
   }
}

