package com.Xattern.Rectangle.java;

import java.util.Scanner;

public class mixed {
    public static void main(String[] args){

        // input value..

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //condition check........

        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){       // for odd number
                for(int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }
            }else{
                for(int j = 0; j < i; j++ ){
                    System.out.print((char) ('A' + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
