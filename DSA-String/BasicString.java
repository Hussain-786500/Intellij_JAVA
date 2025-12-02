package com.stringdsajava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicString {
    public static void main(String[] args){

//        System.out.print("IBRAHIM");            //first type

//        char[] arr = {'I','B', 'R', 'A', 'H', 'I', 'M'};
//        for(char ele : arr){
//            System.out.print(ele);              //2nd type
//        }
//        String str = "IBRAHIM is a developer";
//        System.out.println(str);                //3rd type

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String str = sc.nextLine();

        System.out.print("HII " + str);

    }
}
