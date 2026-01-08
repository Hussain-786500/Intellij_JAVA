package com.stringbuilderjava;
import  java.util.*;
public class StringAstring {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("saudi");
        char[] arr = sb.toString().toCharArray();
        char[] var3 = arr;
        int var4 = arr.length;

        int var5;
        char ele;
        for(var5 = 0; var5 < var4; ++var5) {
            ele = var3[var5];
            System.out.print(ele);
        }

        System.out.println();
        Arrays.sort(arr);
        var3 = arr;
        var4 = arr.length;

        for(var5 = 0; var5 < var4; ++var5) {
            ele = var3[var5];
            System.out.print(ele);
        }

    }
}
