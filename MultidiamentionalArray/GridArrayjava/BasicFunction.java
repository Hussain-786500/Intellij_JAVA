package com.GridArrayjava;

import java.util.*;

public class BasicFunction {
    public static void main(String[] args) {
        //list of Array
        List<Integer> a = new ArrayList<>();
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        List<Integer> b = new ArrayList<>();
        b.add(60);
        b.add(70);
        b.add(80);
        List<Integer> c = new ArrayList<>();
        c.add(90);
        c.add(20);
        List<Integer> d = new ArrayList<>();
        d.add(10);

        //Add Collection of Array in Array List
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);

        for (int i = 0; i < l.size(); i++) {
//            List<Integer> x = l.get(i);
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }


        System.out.println("modify...");
        // ---- MODIFY EXISTING VALUES ----

        //value add.
        l.get(1).add(1, 100);

        //value replace/ set

        l.get(0).set(1, 70);

       //value remove
        l.get(0).remove(2);

        // ---- PRINT RESULT ----
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
           }
        }
    }
