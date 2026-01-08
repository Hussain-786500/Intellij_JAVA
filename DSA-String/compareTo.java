package com.stringdsajava;

public class compareTo {
    public static void main(String[] args){

//    Note :- a = 97, b = 98, c = 99, d = 100.......z = 122;
//         :- A = 65, B = 66, C = 67, D = 68........Z = 90;

//  same string.....
        String a = "dbc";
        String b = "abc";
        System.out.println(a.compareTo(b));      // return 3

//    different string....
        String x = "abc";
        String y = "dbc";
        System.out.println(x.compareTo(y));      // return -3

//    first 3 latter same and remain latter diff...(upper)
        String n = "abcgggg";
        String m = "abc";
        System.out.println(n.compareTo(m));      // return 4

//    first 3 latter same and remain latter diff...(lower)
        String E = "abc";
        String F = "abcgggg";
        System.out.println(E.compareTo(F));      // return -4

//    first comparison after remaining latter check
        String A = "dbcgggg";
        String B = "abc";
        System.out.println(A.compareTo(B));      // return 3

//    compare between capital and small latter
        String X = "abc";
        String Y = "ABC";
        System.out.println(X.compareTo(Y));      // return 3

    }
}
