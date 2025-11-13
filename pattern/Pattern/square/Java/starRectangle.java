package com.Pattern.square.Java;

import java.util.Scanner;
public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column");
        int r = sc.nextInt();
//        System.out.println("Enter the number of column");
        int c = sc.nextInt();
for(int i = 1; i <= r; i++){    // control rows..........
    for(int j = 1; j <= c; j++){  // control column..........
        System.out.print("*");
        }
    System.out.println();
      }
sc.close();
    }
}