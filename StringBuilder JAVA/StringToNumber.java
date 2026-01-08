package com.stringbuilderjava;

import java.util.Scanner;
public class StringToNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = sc.nextLine();
        int total = 0;
        int count = 0;

        for(int i = 0; i < s.length(); ++i) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                total += count * (count + 1) / 2;
                count = 0;
            } else {
                ++count;
            }
        }

        total += count * (count + 1) / 2;
        System.out.println("Total vowel substring count :" + total);
    }
}
