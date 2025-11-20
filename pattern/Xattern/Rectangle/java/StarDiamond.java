package com.Xattern.Rectangle.java;

import java.util.Scanner;
public class StarDiamond {
    public static void main(String[] args){

        //input number........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n  = sc.nextInt();


        int nsp = n-1;
        int nst = 1;
        //condition check..........

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= nsp; j++){
                System.out.print(" " + " "); //spaces
            }
            for(int j = 1;j <= nst; j++){
                System.out.print("*" + " ");   //star
            }
            nsp--;
            nst += 2;
            System.out.println();
        }


        nsp = 1;
        nst = nst -4;
        //condition check..........

        for(int i = 1; i <= n-1; i++){
            for(int j = 1; j<= nsp; j++){
                System.out.print(" " + " "); //spaces
            }
            for(int j = 1;j <= nst; j++){
                System.out.print("*" + " ");   //star
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }

    }
}
