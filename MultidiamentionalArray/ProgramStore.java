//Q1. Write a program to store roll number and marks obtained
// by 4 students side by side in a matrix.

import java.util.Scanner;
public class ProgramStore {
    public static void main(String[] args){

        //input condition
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int r = sc.nextInt();
        System.out.println("Enter cols");
        int c = sc.nextInt();

        int[][] arr = new int[4][2];

        System.out.println("Enter your matrix");

        //condition check
        //inner loop
        for (int i = 0; i < 4; i++) {              // row
            for (int j = 0; j < 2; j++) {          // cols
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("your result");
        //outer loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        }
    }

