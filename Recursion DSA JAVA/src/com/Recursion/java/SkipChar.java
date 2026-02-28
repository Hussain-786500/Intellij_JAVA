package com.Recursion.java;

// Q-> Remove all occurrences of 'a' from a string.
public class SkipChar {
    public static void skip(int i, String s, String ans){
       if(i == s.length()){
           System.out.println(ans);        // Base Case
           return;
       }
        if(s.charAt(i) != 'u')
            ans += s.charAt(i);
              skip(i+1, s, ans);
    }
    public static void main(String[] args){

        String s = "Rahul Walia";
        skip(0, s, " ");

    }
}
