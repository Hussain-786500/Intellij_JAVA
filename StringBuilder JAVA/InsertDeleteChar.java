package com.stringbuilderjava;

public class InsertDeleteChar {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("NAWAA");
        s.insert(4, 'D');
        System.out.println(s);
        s.setCharAt(2, 'V');
        System.out.println(s);
    }
}
