package com.Inharitancejava;
//     ----- create Parent class -----
class Animals {
    void eat() {
        System.out.println("Animal eat food");
    }
}
//    ----- create child  class -----
    class Dog extends Animals{
        void bark(){
            System.out.println("Dog Barks");
        }
     }
public class SingleInheritance {
    public static void main(String[] args){

        Dog d = new Dog();
        d.eat();           //  Animal eat food
        d.bark();          //  Dog Barks
    }
}
