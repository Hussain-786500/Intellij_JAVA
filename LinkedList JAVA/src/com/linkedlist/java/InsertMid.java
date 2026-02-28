package com.linkedlist.java;

//    ---- create class ----
class MID{
    Node head;
    Node tail;
    int size;

//   ---- Insert at head ----
    void InsertHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

//    ---- Insert at end ----
    void InsertEnd(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }

//    ---- Mid Insert Function ----
    void midInsert(int idx, int val){
        if(idx == 0){
            InsertHead(val);
             return;
        }
        if(idx == size){
            InsertEnd(val);
            return;
        }
        if(idx > size){
            System.out.println("Invalid Index");
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx-1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }

//     ---- display function ----
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
//     ----- size method ----
    void size(){
        System.out.println("size : " + size);
    }
}
public class InsertMid {
    public static void main(String[] args){

        MID list = new MID();
        list.InsertHead(20);
        list.InsertHead(30);
        list.InsertHead(40);
        list.InsertHead(50);
        list.size();
        list.display();

        list.midInsert(2, 100);
        list.size();
        list.display();


    }
}
