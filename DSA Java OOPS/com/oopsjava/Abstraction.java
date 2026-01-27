package com.oopsjava;

//       ************ first abstract ************

////    ----- create Abstract class ------
//abstract class Animal{
//    abstract  void sound();
//}
//
////   ---- create child class ----
//  class Dog extends Animal{
//    void  sound(){    // implementation method
//
//        System.out.println("Dog Barks");
//    }
//}
//
////    ----- main class -----
//public class Abstraction {
//    public static void main(String[] args){
//
//        Animal a = new Dog();
//        a.sound();
//    }
//}




//        ************ Second abstract ************

//      ---- create abstract class ----
    interface vehicle {
        void start();     // Abstract method
}

//    ---- child class ----
class Bike implements vehicle{
        public void start(){
            System.out.println("Bike strat with key");
        }
}

public class Abstraction {
    public static void main(String[] args){

        vehicle v = new Bike();
        v.start();
    }
}