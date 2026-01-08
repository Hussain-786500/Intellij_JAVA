package com.stringbuilderjava;

import java.util.Scanner;
public class InputStringToggle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();

        for(int i = 0; i < n; ++i) {
            char ch = sb.charAt(i);
            int ascii;
            if (ch >= 'A' && ch <= 'Z') {
                ascii = ch + 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            } else if (ch >= 'a' && ch <= 'z') {
                ascii = ch - 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
        }

        System.out.println(sb);
    }
}
