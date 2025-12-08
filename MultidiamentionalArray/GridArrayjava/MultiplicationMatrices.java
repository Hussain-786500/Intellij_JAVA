package com.GridArrayjava;

//Q1. Write a program to print the multiplication of two matrices
// given by the user.

//1st method
//public class MultiplicationMatrices {
//public  static void main(String[] args){
//
//    int[][] A = {{1, 2, 3},{4, 5, 6}};
//
//    int[][] B = {{7, 8}, {9, 10}, {11, 12}};
//
//    int n = A.length, m = A[0].length, p = B[0].length;
//    int[][] C = new int[n][p];
//
//    for (int i = 0; i < n; i++) {
//        for (int k = 0; k < m; k++) {
//            for (int j = 0; j < p; j++) {
//                C[i][j] += A[i][k] * B[k][j];
//            }
//        }
//    }
//
//                for(int[] r : C){
//                    for(int x : r) System.out.print(x + " ");
//                    System.out.println();
//                }
//            }
//        }
//



//2nd method
public class MultiplicationMatrices {
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

//        -------- input A,B Matrices -------

        int[][] A = {{1, 2, 3},{4, 5, 1},{3, 2, 1}};
        int[][] B = {{1, 2, 3},{4, 5, 1},{3, 2, 1}};

//        ------- Min logic code -------

        if(A[0].length != B.length){
            System.out.println("Multiplication not possible");
        }else {
            int[][] C = new int[A.length][B[0].length];
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[0].length; j++) {
                    for(int k = 0; k < B.length; k++){
                        C[i][j] += (A[i][k] * B[k][j]);
                    }
                }
            }

//            -------- print the result -------

            System.out.println("Matrix of A: ");
            print(A);
            System.out.println("Matrix of B: ");
            print(B);
            System.out.println("final res after multiplication: ");
            print(C);
        }
    }
}
