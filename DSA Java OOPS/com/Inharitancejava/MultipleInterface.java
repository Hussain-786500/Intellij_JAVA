package com.Inharitancejava;

//    ---- Parent interface A ----
interface A {
    void show();
}
//   ---- Parent interface B ----
interface B {
    void display();
}

//    ---- child class implements both interface ----
class C implements A, B {

//    --- implementation of show ---
    public void show(){
        System.out.println("This is show method from interface A");
    }
//     --- implementation of display ---
    public void display(){
        System.out.println("This is display method from interface");
    }
}

//  ---- main class ----
public class MultipleInterface {
    public static void main(String[] args){

        C obj = new C();
        obj.show();
        obj.display();

        }
    }

