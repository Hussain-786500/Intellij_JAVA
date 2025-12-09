package com.stringbuilderjava;

public class StringLargest {

    public static void main(String[] args) {
        String[] arr = new String[]{"7", "3", "5", "2", "6"};
        int largest = 0;
        int secondLargest = 1;
        String[] var4 = arr;
        int var5 = arr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String s = var4[var6];
            int digit = s.charAt(0) - 48;
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }

        System.out.println("secondLargest digit: " + secondLargest);
        System.out.println("Largest digit :" + largest);
    }
}
