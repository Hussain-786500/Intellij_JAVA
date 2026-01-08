package com.stringbuilderjava;
import  java.util.Scanner;
public class ConvertInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numeric String:");
        String s = sc.nextLine();
        int num = Integer.parseInt(s);
        System.out.println(num);
    }
}

