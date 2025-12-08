package com.stringbuilderjava;

public class CompressedString {

    public static String compress(String s) {
        if (s != null && !s.isEmpty()) {
            StringBuilder result = new StringBuilder();
            int count = 1;

            for(int i = 1; i < s.length(); ++i) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    ++count;
                } else {
                    result.append(s.charAt(i - 1)).append(count);
                    count = 1;
                }
            }

            result.append(s.charAt(s.length() - 1)).append(count);
            return result.toString();
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        String s = "aaabbgggghhyhhhttttdd";
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;

        int len;
        while(j < arr.length) {
            if (arr[j] == arr[i]) {
                ++j;
            } else {
                ans.append(arr[i]);
                len = j - i;
                if (len > 1) {
                    ans.append(len);
                }

                i = j;
            }
        }

        ans.append(arr[i]);
        len = j - i;
        if (len > 1) {
            ans.append(len);
        }

        System.out.println(ans.toString());
    }
}


