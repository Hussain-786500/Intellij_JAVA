package com.Inharitancejava;
//     ---- create GrandParent class ----
    class Animal{
        void eat(){
            System.out.println("Animal eat food");
        }
    }
//     ---- create parent class ----
class Dogs extends Animal{
     void bark(){
         System.out.println("Dog Barks");
     }
}
//     ----- create child class -----
class Puppy extends Dogs{
        void weep(){
            System.out.println("Puppy Sleep");
        }
}

public class MultilevelInheritance {
    public static void main(String[] args){

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
