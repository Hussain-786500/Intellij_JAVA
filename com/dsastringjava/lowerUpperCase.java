package com.dsastringjava;

//public class lowerUpperCase {
//    public static void main(String[] args){

//        ---- for toLowerCase ----

//        first type.....
//String str = "HII IBRAHIM HUSSAIN";
//str.toLowerCase();
//        System.out.println(str.toLowerCase());    // print but not originally change

//        2nd type.....
//String str = "HII IBRAHIM HUSSAIN";
//       str =  str.toLowerCase();            // print but this is originally change
//        System.out.println(str);
//    }
//}

//       ----- for toUpperCase -----

//        first type.....
//String str = "hii ibrahim hussain";
//str.toUpperCase();
//        System.out.println(str.toUpperCase());

//        2nd type.....
//String str = "hii ibrahim hussain";
//str =  str.toUpperCase();
//        System.out.println(str);
//    }
//            }



public class lowerUpperCase {
    public static void main(String[] args){

//        1st type....
//        String a = "ibrahim";
//        String b = " hussain";
//
//        System.out.println(a+b);

//        2nd type...
//        String a = "ibrahim";
//        String b = " hussain";
//        System.out.println(a.concat(b));

//        3rd type...
        String a = "ibrahim";
        String b = " hussain";
        a = a.concat(b);
        System.out.println(a);
    }
}