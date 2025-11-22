package com.NumberSpiraljava;

import java.util.Scanner;
public class NumberSpiral {
    public static void main(String[] args){

        //input number....

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //condition check.....

        for (int i = 1; i <= 2*n-1; i++){
            for (int j = 1; j<= 2*n-1; j++ ){
                int a = i , b = j;
                if(i>n) a = 2*n-i;
                if(j>n) b = 2*n-j;
                System.out.print(n+1-Math.min(a, b) + "  ");
            }
            System.out.println();
        }
    }
}


// Binary 0/1 trangle code...........

mport java.util.Scanner;
public class Basic2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();

        //condition check...
       for(int i = 1; i <= n; i++){            // outer loop
           for(int j = 1; j <= i; j++){        // inner loop
               int sum = i+j;
               if(sum % 2 == 0){
                   System.out.print("1 ");      // even
               }else {
                   System.out.print("0 ");    // odd
               }
           }
           System.out.println();
       }
    }
}
