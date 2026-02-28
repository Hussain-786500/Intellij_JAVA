package com.linkedlist.java;

//   ---- Create blueprint clasS ----
class SLL{
    Node head;
    Node tail;
    int size;

//    ---- insert Function ----
    void InsertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

//    ---- display print Function ----
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();      // next line
    }
//    ---- size method ----
    void size(){
        System.out.println("Length of Linked List is :" + size);
    }
}
//      ----- main function ----
public class InsertEnd {
    public static void main(String[] args){

        SLL list = new SLL();
        list.size();
        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.size();
        list.display();

//     ---- value insert in end ----
        list.InsertAtEnd(28);
        list.size();
        list.display();


    }
}
