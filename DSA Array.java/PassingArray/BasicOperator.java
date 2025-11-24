package com.PassingArray;

//Normal......

//import java.util.ArrayList;
//public class BasicOperator {
//    public static void main(String[] args){
//
//        ArrayList<Integer> arr = new ArrayList<>(5);
//        arr.add(0, 10);
//        arr.add(1, 20);
//        arr.add(2, 30);
//        arr.add(3, 40);
//        arr.add(4, 50);
//
//        System.out.println(arr.get(2));
//        System.out.println(arr.get(0));
//
//    }
//}


//FOR For Loop.........

import java.util.ArrayList;

public class BasicOperator {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);

//        System.out.println(arr);   // directly print.......
        System.out.println(arr.size());
        for (int i = 0; i <= 4; i++) {
            System.out.print(arr.get(i) + " ");
        }

        // change/ modify.........
        System.out.println(arr.size());
        System.out.println();
        arr.set(2, 350);
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        // add valuue....

        arr.add(90);   //push back
        System.out.println();
        System.out.println(arr.size());
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.remove(5);
        System.out.println(arr + " " + arr.size());
    }
}