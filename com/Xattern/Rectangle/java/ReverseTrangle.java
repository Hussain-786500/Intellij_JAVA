package com.Xattern.Rectangle.java;
import java.util.Scanner;
public class ReverseTrangle {
    public static void main(String[] args){

        // input value........
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        // condition check.........

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n + 1-i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

