package com.oopsjava;

//   ----- creating a new data type (like: Blueprint) ----
public class Student {
        public String name;
        private int num;
        double percent;


//        ------ getter -----
    public int getNum() {
        return num;                        // this is attribute, this not change value  but not access value
    }

//      ------ setter ------

    public void setNum(int num){
      this.num = num;                         //  this is attribute, it can  change value  but not access value
    }
}

