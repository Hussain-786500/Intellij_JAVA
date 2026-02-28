package com.Recursion.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestDivisor {
    public static int hcf(int a, int b){
        if(b % a == 0){
            return a;
        }
        return hcf(b % a, a);                    // T.C -> O(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();

        System.out.println("Greatest Divisor is: " + hcf(a, b));
    }
}
