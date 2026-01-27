package com.oopsjava;
public class AddFraction {

//       ----- create f3 add function ----
    public static fraction add(fraction f1, fraction f2) {
        int numerator = f1.num * f2.den + f1.den * f2.num;
        int denominator = f1.den * f2.den;
        fraction f3 = new fraction(numerator, denominator);

        return f3;
    }
//        ----- create find HCF function -----
    public static int gcd(int num, int den) {
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (den % i == 0 && num % i == 0) return i;
        }
        return min;
    }
    //    ----- create a fraction class (blueprint) -----
    public static class fraction {
        int num;
        int den;

//        ----- Create Constructor -----
        public fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
//        ----- create simplify fraction -----
        public void simplify(){
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String[] args) {

//    ----- createObject and value initialize -----
        fraction f1 = new fraction(35, 21);
        System.out.println(f1.num + "/" + f1.den);

        fraction f2 = new fraction(7, 3);
        System.out.println(f2.num + "/" + f2.den);

        fraction f3 = add(f1,f2);
        System.out.println(f3.num + "/" + f3.den);

    }
}
