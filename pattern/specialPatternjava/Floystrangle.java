package com.specialPatternjava;
import java.util.Scanner;
public class Floystrangle {
    public static void main(String[] args){

        //input number..........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        // condition check........
        int a = 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(a + " ");
                a ++;
            }
            System.out.println();
        }

    }
}
