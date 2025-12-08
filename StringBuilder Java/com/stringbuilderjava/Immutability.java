package com.stringbuilderjava;

public class Immutability {

    public static void main(String[] args) {
        String s = "ZERO";
        char[] arr = s.toCharArray();
        arr[0] = 'M';
        arr[1] = 'A';
        arr[3] = 'A';
        String res = new String(arr);
        System.out.println(res);
    }
}
