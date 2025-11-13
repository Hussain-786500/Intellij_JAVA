package com.compositPatternjava;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class StarBridge {
    public static void main(String[] args){

//        input number..........

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

//        condition check............

        for(int i = 1; i <=2*n-1; i++){
                System.out.print("*" + " ");
            }
            System.out.println();
        n--;
        for(int i=1; i<=n; i++ ){    //print rows
            for(int j=1; j<= n+1-i; j++){    //stars
                System.out.print("*" + " ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("#" + " ");  // spaces
            }
            for(int j = 1; j<=n+1-i; j++){  // stars
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        }
     }
