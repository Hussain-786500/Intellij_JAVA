package com.Recursion.java;

import java.util.Scanner;

public class CalculatePower {
    public static int power(int a, int b){
        if(a == 0 && b == 0){                     // TC = O(b) is very slow
            System.out.println("Not Define: ");
            return -1;
        }
        if(b == 0) return 1;
        return a * power(a, b-1);
    }
    public static int power2(int a, int b){
        if(b == 0) return 1;                      // TC = O(log b) much better fast
        int ans = power2(a, b/2);
        if(b % 2 == 0)return ans * ans;
        else return ans * ans * a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base");
        int a = sc.nextInt();
        System.out.println("Enter Power");
        int b = sc.nextInt();
        System.out.println(a + "raised the power " + b + " is " + power2(a, b));
    }
}
