package com.compositPatternjava;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class NumberBridge {
    public static void main(String[] args){

        //input number............

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //  ---- condition check ----
        
        // first row----
        for(int i =1; i <= n*2-1; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        // remaining row----
        for(int i = 1; i <= n-1; i++){

       // left number print----
        for(int i = 1; i <= n-i; i++){
            System.out.print(j + " ");
        }
        // spaces print----
            for(int i = 1; i <= 2*i-1; i++){
            System.out.print("  ")
        }       
            // right number print---
            for(int i = n-i; i <= 1; i--){
            System.out.print(j + " ")
      }
        System.out.print();
    }
  }
}
