package com.linkedlist.java;
//   --- create class ----
class SllS {
    Node head;
    Node tail;
    int size;

    //    ---- Create insert function ----
    void insertFirst(int val){
        Node temp = new Node(val);
        if(head == null) tail = head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
//    ---- Create display function ----

    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

//     ---- Create size method ----
    void size(){

        System.out.println("Size of LinkedList: " + size);
    }
}

public class InsertFirst {
    public static void main(String[] args){
        SllS list = new SllS();

        list.insertFirst(10);
        list.insertFirst(20);
        list.display();
        list.size();

        list.insertFirst(5);
        list.display();
        list.size();

    }
}
