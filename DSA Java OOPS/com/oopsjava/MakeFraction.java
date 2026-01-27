package com.oopsjava;

// Q -> Make the fraction class.

public class MakeFraction {

//   ------ create find hcf function -----
    public static  int  gcd(int num, int den){
       int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if(num % i == 0 && den % i == 0) return i;
        }
        return min;
    }
    public static class fraction{      // make static fraction class (blueprint)
        int num;
        int den;

//        ----- create Constructor -----
        public fraction(int num, int den){
            this.num = num;
            this.den = den;
        }
//        ---- create simplify function ----
        public void simplify(){
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String[] args){

//        ----- create object and value initialize ----
        fraction f1 = new fraction(35, 21);        // answer 5/3
        System.out.println(f1.num + "/" + f1.den);
        f1.simplify();
        System.out.println(f1.num + "/" + f1.den);
    }
}
