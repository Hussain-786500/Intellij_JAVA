package com.Recursion.java;

public class BasicRecursion {
    public static void mango(){
        System.out.println("i am in mango");
    }
    public static void banana(){
        System.out.println("i am in banana");
        mango();
    }
    public static void apple(){
        System.out.println("i am in Apple");
        banana();
    }
    public static void main(String[] args) {

        System.out.println("Hii i am in main method");
        apple();

    }
}
