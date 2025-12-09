package com.stringbuilderjava;

import java.util.Scanner;
public class StringBuilderInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        sb.setCharAt(1, 'a');
        System.out.println(sb);
    }
}
