package com.stringbuilderjava;

import java.util.*;
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != s.length()) {
            return false;
        } else {
            char[] a = s.toCharArray();
            char[] b = s.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);

            for(int i = 0; i < a.length; ++i) {
                if (a[i] != b[i]) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s = sc.nextLine();
        System.out.println("Enter second String: ");
        String t = sc.nextLine();
        boolean res = isAnagram(s, t);
        System.out.println(res);
    }
}
