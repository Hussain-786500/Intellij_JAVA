package com.stringbuilderjava;

    public class Append {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("HERO");
            System.out.println(sb);
            sb.append("PANTI");
            System.out.println(sb);
            sb.append(123);
            System.out.println(sb);
            char[] ch = new char[]{'W', 'A', 'L', 'A'};
            sb.append(ch);
            System.out.println(sb);
            StringBuilder t = new StringBuilder("pqr");
            sb.append(t);
            System.out.println(sb);
        }
    }


