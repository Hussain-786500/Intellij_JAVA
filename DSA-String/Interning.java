package com.stringdsajava;

//public class Interning {
//    public static void main(String[] args){
//        String s = " IBRAHIM";
//        s = "HUSSAIN";
//        System.out.println(s);
//    }
//}


        public class Interning {
            public static void main(String[] args){
                String s1 = "Ibrahim";
                String s2 = "Ibrahim";

                String s3 = new String("Ibrahim");
                String s4 = s3.intern();

                System.out.println(s1 == s2);    //true
                System.out.println(s1 == s3);    //false
                System.out.println(s1 == s4);    //true
            }
}
