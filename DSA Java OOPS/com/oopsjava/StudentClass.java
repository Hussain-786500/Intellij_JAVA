package com.oopsjava;

import java.sql.SQLOutput;

public class StudentClass {

    //   ----- creating a new data type (like: Blueprint) ----
//    public static  class Student{
//        String name;
//        int num;
//        double percent;   // this class access of another file and easy to run without error (file name - Student.java)
//    }
//      ---- print function ----
    public static void print(Student x){
        System.out.println(x.name);
        return;
    }
//      ------ update/change function ------
    public static void change(Student s){
        s.name = "Ahmed";
    }
//      ------ main function ------
    public static void main(String[] args) {

//        create space(Array) in memory----
//        student[] stud = new student[5];

//       create object of student 1 -----
        Student x = new Student();

//       initialize value using (.) operator-----
        x.name = "ibrahim";
//        x.num = 12008;
        x.percent = 92.5;

//  ---------------------------------------------------------------------
        x.setNum(77);
        System.out.println(x.getNum());     // this access value from setter individual value because this priv
//  -----------------------------------------------------------------------

        print(x);      // one print
//
////       update value-------
//        x.name = "Rahul";
//        print(x);                // name change / update
//
////        change value through function------
//
//        change(x);
//        System.out.println(x.name);    // pass by reference (change name)

    }
}

