package com.oopsjava;


//    ---- create interface ----
    interface Animal{

//     ---- Abstract method (no body) ----
    void sound();
}
//     ---- class implements interface ----
class Dog implements Animal {

    //      ---- must implement interface method ----
    public void sound() {
        System.out.println("Dog Barks");
    }
}
//     ---- main class ---
public class Interface {
        public static void main(String[] args){

            Animal a = new Dog();
            a.sound();
        }
  }

