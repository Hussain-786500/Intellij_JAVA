package com.stringbuilderjava;

import java.util.*;
public class Isomorphic {
    public static boolean isValue(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] map1 = new int[128];
        int[] map2 = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2;
                map2[c2] = c1;
            }
            else {
                if (map1[c1] != c2 || map2[c2] != c1)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean res = isValue(s, t);
        System.out.println(res);
    }
}