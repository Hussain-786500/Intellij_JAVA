package com.Inharitancejava;

//    ----- create parent class -----
class car{
    void start(){
        System.out.println("Car Start");
    }
}
//   ----- Create child-1 class ------
class engine extends car{
    void run(){
        System.out.println("Engine Run");
    }
}
//    ----- Create child-2 class -----
class light extends car{
    void ON(){
        System.out.println("Light On");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args){

        engine e = new engine();
        e.start();
        e.run();

        light l = new light();
        l.start();
        l.ON();
    }
}
