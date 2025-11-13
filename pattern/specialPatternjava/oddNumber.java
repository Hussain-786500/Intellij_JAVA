package com.specialPatternjava;

//             ********** Odd Number Trangle **********

import java.util.Scanner;
public class oddNumber{
    public static void main(String[] args){

        //input number..........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        // condition check........

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }


    }
}


