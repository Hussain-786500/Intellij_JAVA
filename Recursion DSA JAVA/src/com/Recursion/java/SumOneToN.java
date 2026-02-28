package com.Recursion.java;

import java.util.Scanner;

public class SumOneToN {
    public static void sum(int n, int s){
        if(n == 0){         // Base Case
            System.out.println(s);
            return;
        }
        sum(n-1, s+n);    // call and work
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sum(n, 0);

        }
    }

