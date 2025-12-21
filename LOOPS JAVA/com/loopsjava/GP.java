package com.loopsjava;

//            ******** GP (Geometric Progression ********

// Q-> Display this GP - 1, 2, 4, 8, 16, 32........upto 'n' terms.

import java.util.Scanner;

public class GP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

//        1, 2, 4, 8, 16.........n
        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a *= 2;
        }
    }
}
