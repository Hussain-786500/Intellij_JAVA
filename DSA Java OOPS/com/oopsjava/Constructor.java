package com.oopsjava;

public class Constructor {
    String name;
    int roll;
    double percentage;
    final String schoolName = "PBSC";    // i can not change this value anytime (immutable)

    static  int numberOfStudents;    //    static keyword -----

//    ----- default Constructor -----
    public Constructor(){

    }
    public Constructor(String naam, int roll, double per){
        this.name = naam;
        this.roll = roll;
        this.percentage = per;
        numberOfStudents++;
    }
}
