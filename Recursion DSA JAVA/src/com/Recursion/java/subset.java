package com.Recursion.java;

public class subset {
    public static void set(int i, String s, String ans){
        if(i == s.length()){
            System.out.print(ans);
            return;
        }
        char ch = s.charAt(i);
        set(i+1, s, ans+ch);    // Take
        set(i+1, s, ans);            // Not Take
    }
    public static void main(String[] args){
         String s = "123";
         set(0, s, " ");
    }
}
