package com.oopsjava;
//       ********** Overriding Polymorphism **********
//
////  ---- parent class ----
class Animali {
    void sound(){
        System.out.println("Animal makes a sound");     // method to be overridden
    }
}
//   ---- child class Dog ----
class Dogi extends Animali {

    void sound(){
        System.out.println("Dog Barks");      //  method to be overridden
    }
}

//   ---- my created class ----
public class Polymorphism {

//     ---- main class ----
public static void main(String[] args){

//    ---- Parent class reference ----
    Animali a;

//    --- Dog object ---
    a = new Dogi();
    a.sound();       // Output: Dog barks
   }
}


//    ********** Overloading Polymorphism **********


//    ---- create parent class ----
//    class Calculator {
//
////    ---- Method with 2 parameters ----
//
//    int add(int a, int b){
//        return a + b;
//    }
////    ---- Same method but different parameters ----
//    int add(int a, int b, int c){
//        return a + b + c;
//    }
//}
////    ----- main class -----
//public class Polymorphism {
//    public static void main(String[] args){
//
////     ----- create new object -----
//
//        Calculator c = new Calculator();
//        System.out.println(c.add(4, 3));
//        System.out.println(c.add(2, 4, 6));
//    }
//}