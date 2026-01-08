package com.stringbuilderjava;

public class maxOccurrence {

    public static void main(String[] args) {
        String s = "hussainshahjjj";
        int[] freq = new int[26];
        char[] var3 = s.toCharArray();
        int i = var3.length;

        int var5;
        int c;
        for(var5 = 0; var5 < i; ++var5) {
            c = var3[var5];
            ++freq[c - 97];
        }

        int maxCount = 0;
        int[] var9 = freq;
        var5 = freq.length;

        for(c = 0; c < var5; ++c) {
            int f = var9[c];
            if (f > maxCount) {
                maxCount = f;
            }
        }

        for(i = 0; i < 26; ++i) {
            if (freq[i] > 0) {
                char ch = (char)(i + 97);
                System.out.println("" + ch + " = " + freq[i]);
            }
        }

        System.out.println("\nMax occurring character: ");

        for(i = 0; i < 26; ++i) {
            if (freq[i] == maxCount) {
                System.out.println((char)(i + 97) + " = " + maxCount);
            }
        }

    }
}

