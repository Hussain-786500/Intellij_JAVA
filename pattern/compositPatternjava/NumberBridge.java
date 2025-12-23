package com.compositPatternjava;
                                                      // * this loop for same number print 
import com.sun.security.jgss.GSSUtil;                 //    for(int i = n-i; i <= 1; i--)    //only last loop change
import java.util.Scanner;
public class NumberBridge {                           // * this loop for continuer number print
    public static void main(String[] args){           //  for (int j = n + i; j <= 2 * n - 1; j++)
                                                    
        //input number............

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //  ---- condition check ----
        
        // first row----
        for(int i =1; i <= n*2-1; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        // remaining row----
        for(int i = 1; i <= n-1; i++){

       // left number print----
        for(int i = 1; i <= n-i; i++){
            System.out.print(j + " ");
        }
        // spaces print----
            for(int i = 1; i <= 2*i-1; i++){
            System.out.print("  ")
        }       
            // right number print---
            for(int i = n-i; i <= 1; i--){
            System.out.print(j + " ")
      }
        System.out.print();                           
    }
  }
}
