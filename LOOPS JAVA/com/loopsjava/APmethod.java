package com.loopsjava;
//              ******** AP(Arithmetic Progression ********

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

// Q-> Display this AP- 1, 3, 5, 7, 9....upto 'n' terms.
public class APmethod {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

//        1 3 5 7 9 .........
        for (int i = 1; i <= n*2-1; i+= 2) {
            System.out.println(i);
        }
        }
    }

