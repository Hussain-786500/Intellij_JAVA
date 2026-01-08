package com.stringbuilderjava;

public class MaximumValue {

    public static void main(String[] args) {
        String[] arr = new String[]{"00476", "000746", "56354", "0025"};
        String max = arr[0];
        String[] var3 = arr;
        int var4 = arr.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String s = var3[var5];
            if (isGreater(s, max)) {
                max = s;
            }
        }

        System.out.println(max);
    }

    public static boolean isGreater(String a, String b) {
        a = isPurify(a);
        b = isPurify(b);
        if (a.length() != b.length()) {
            return a.length() > b.length();
        } else {
            return a.compareTo(b) > 0;
        }
    }

    public static String isPurify(String s) {
        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) > '0') {
                return s.substring(i);
            }
        }

        return s;
    }
}


