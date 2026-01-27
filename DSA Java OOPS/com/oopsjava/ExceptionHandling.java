package com.oopsjava;

import com.sun.security.jgss.GSSUtil;

public class ExceptionHandling {
    public static void main(String[] args){
try {
    int a = 10;
    int b = 0;

//     --- Risky code ---
    int result = a / b;

        System.out.println(result);

   }catch (Exception e){

//     ---- Handles the error ----
    System.out.println("can not divide by zero");

   }

//     ---- program continue ----
        System.out.println("Program continues...");
    }
}
