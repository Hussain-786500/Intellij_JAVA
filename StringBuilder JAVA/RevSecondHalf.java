package com.stringbuilderjava;

import java.util.Scanner;
public class RevSecondHalf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int n = s.length();
        if (n % 2 != 0) {
            System.out.println("String length is not even!");
        } else {
            String first = s.substring(0, n / 2);
            String second = s.substring(n / 2);
            String revSecond = "";

            for(int i = second.length() - 1; i >= 0; --i) {
                revSecond = revSecond + second.charAt(i);
            }

            System.out.println("Result:" + first + revSecond);
        }
    }
}
