package com.Pattern.square.Java;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args){

        // input number...........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        // condition check............

        for(int i = 1; i <= n; i++){   // control rows.......
            for(int j = 1; j <= n; j++){
                System.out.print("*");   // control column........
            }

            System.out.println();

        }
    }
}
