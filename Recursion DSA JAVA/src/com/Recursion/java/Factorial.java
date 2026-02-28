package com.Recursion.java;

import java.util.Scanner;

// Q-> Make the function which calculate the factorial of an using recursion.
public class Factorial {
    public static int fact(int n){
       if(n == 1) return 1;
       return n * fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
}
