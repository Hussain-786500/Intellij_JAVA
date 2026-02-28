package com.linkedlist.java;

//            ----- create class ------
    class Node{
    public int val;
    public Node next;

    //     ------ create constructor ------
    public Node(int val){
        this.val = val;
    }
}
public class LinkNode {
    public static void main(String[] args){

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // linking a and b then came same address.
        a.next = b;    // 10 -> 20
        b.next = c;    // 10 -> 20 -> 30
        c.next = d;    // 10 -> 20 -> 30 -> 40
        d.next = e;    // 10 -> 20 -> 30 -> 40 -> 50

        System.out.println(a.val);                      // a
        System.out.println(a.next.val);                 // b
        System.out.println(a.next.next.val);            // c
        System.out.println(a.next.next.next.val);       // d
        System.out.println(a.next.next.next.next.val);  // e

    }
}
