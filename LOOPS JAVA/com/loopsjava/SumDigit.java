package com.loopsjava;

// Q-> WAP to print sum of digits of a given numbers.
public class SumDigit {
    public static void main(String[] args) {
        int n = 746538;
        int sum = 0;

        while (n != 0){
            int digit = n % 10;
             sum += digit;

             n/= 10;
        }
        System.out.println("sum number " + sum);
    }
}
