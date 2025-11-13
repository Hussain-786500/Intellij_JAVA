package com.Pattern.square.Java;
import java.util.Scanner;
public class NumSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        //condition check...........

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
