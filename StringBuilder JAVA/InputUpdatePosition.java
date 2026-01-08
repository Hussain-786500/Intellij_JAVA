package com.stringbuilderjava;

public class InputUpdatePosition {

    public static void main(String[] args) {
        String s = "IBRAHIM HUSSAIN";
        String str = "";
        int n = s.length();

        for(int i = 0; i < n; ++i) {
            if (i % 2 == 0 && s.charAt(i) != ' ') {
                str = str + "A";
            } else {
                str = str + s.charAt(i);
            }
        }

        System.out.println(str);
    }
}
