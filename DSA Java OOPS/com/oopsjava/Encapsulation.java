package com.oopsjava;

//   ---- create a class (Blueprint) -----
class Human {
    private int age = 67;
    private String name = "ibrahim";
    private double marks = 98.0;


    //   ---- i get value through some get method After private -----

//    getter-----
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public double getMarks(){
        return marks;
    }

//     Setter-----
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
//  ---- main class -----
public class Encapsulation {
    public static void main(String[] args){

//     ---- this normal way print value without private ----
        Human obj = new Human();
//        obj.age = 23;
//        obj.name = "ibrahim";
//        obj.marks = 98.9;

//        ---- for setter initialize ----
        obj.setName("rahul");
        obj.setAge(67);

//        ----for getter output-----
//      System.out.println(obj.getAge() + "\n" + obj.getName() + "\n" + obj.getMarks());

//        ---- for setter output ----
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
