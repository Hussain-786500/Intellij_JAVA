package com.stringbuilderjava;

public class ReverseCount {
    public static void main(String[] args) {
        String s = "RAAH";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; --i) {
            rev = rev + s.charAt(i);
        }

        String res = rev + s;
        System.out.println("Result :" + res);
    }
}