package com.oopsjava;

import java.sql.SQLOutput;

public class ConstructorClass {
    public static void main(String[] args){

//        1st Object--------
//        Constructor x = new Constructor();
//          x.name = "Ahmed";
//          x.roll = 3478;
//          x.percentage = 98.9;
//        System.out.println(x.name);
//        System.out.println(x.roll);
//        System.out.println(x.percentage);
//

        System.out.println();   // next line

//        2nd Object--------
//        Constructor x1 = new Constructor("ibrahim", 66, 92.2);
//        System.out.println(x1.name);
//        System.out.println(x1.roll);
//        System.out.println(x1.percentage);
//
//        System.out.println(x1.schoolName);   // this is not immutable


//         ------ for static keyword ------
        Constructor s = new Constructor("ibrahim", 66, 92.2);
        System.out.println(s.numberOfStudents);       // print   1
        Constructor s1 = new Constructor("walia", 86, 82.2);
        System.out.println(s1.numberOfStudents);     //  print   2
        Constructor s2 = new Constructor("hemant", 96, 72.2);
        System.out.println(s2.numberOfStudents);     //  print   3
    }
}
