package com.linkedlist.java;

public class ShallowCopyNode {

//     ---- print function ----
    public static void print(Node head){
        Node temp = head;
        while (temp != null){
            for (int i = 1; i <= 5; i++) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {

        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);

//        ---- linking ----
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        ---- print ----
        print(a);
        }
    }

