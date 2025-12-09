package com.stringbuilderjava;

public class lexicographicallyMaximum {

    public static String maxWord(String str) {
        String[] words = str.split(" ");
        String max = words[0];
        String[] var3 = words;
        int var4 = words.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String w = var3[var5];
            if (w.compareTo(max) > 0) {
                max = w;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String str = "cat apple mango";
        System.out.println(maxWord(str));
    }
}
