package com.linkedlist.java;

public class DisplayRecursive {

    //     ---- Printing Function ----
    public static void Print(Node head) {
        Node temp = head;
        while (temp != null) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }
//        ---- create DisplayRecursive Function ----
        public static void displayRecursive (Node head){

            if (head == null) return;           // Base case
            System.out.println(head.val);
            displayRecursive(head.next);
        }

//        ---- main Function ----
        public static void main (String[]args){
            Node a = new Node(15);
            Node b = new Node(30);
            Node c = new Node(45);
            Node d = new Node(60);
            Node e = new Node(75);

//       ---- Linking ----
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

//      ---- Printing ----

            displayRecursive(a);
//            Print(a);
        }
    }

