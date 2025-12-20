package com.binarySearchjava;

// solve frm sort way but not efficient
//
//public class SqrtX {
//    public static int mySqr(int x){
//        return (int) Math.sqrt(x);
//    }
//
//    public static void main(String[] args){
//
//        SqrtX obj = new SqrtX();
//        int x = 0;
//        System.out.println(mySqr(x));
//    }
//}


// Efficient way

public class SqrtX {
    public static int mySqr(int x){
       if(x < 2) return x;

       int lo = 1, hi = x/2;
       int ans = 0;

       while(lo <= hi){
           int mid = lo+(hi-lo)/2;
           long sq = (long) mid*mid;

           if(sq == x){
               return mid;
           }else if(sq < x){
               ans = mid ;
               lo = mid +1;
           }else {
               hi = mid -1;
           }
       }
       return ans;
    }
    public static void main(String[] args) {
        SqrtX s = new SqrtX();
        System.out.println(s.mySqr(8));  // 2
        System.out.println(s.mySqr(16)); // 4
    }
}