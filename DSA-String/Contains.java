package com.stringdsajava;

public class Contains {
    public static void main(String[] args){

//        from contains.......
        String c = "Amazon is largest forest";
        System.out.println(c.contains("Bamazon"));       //false
        System.out.println(c.contains("Amazon"));        //true


//        from startWith........
        System.out.println(c.startsWith("fores"));         // false
        System.out.println(c.startsWith("Ama"));        //true


//        from endWith......
        System.out.println(c.endsWith("est"));             //true
        System.out.println(c.endsWith("zon"));             //false
    }
}
