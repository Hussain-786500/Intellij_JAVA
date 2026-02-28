package com.linkedlist.java;

//  ---- create class ----
class SET {
    Node head;
    Node tail;
    int size;

    //     ----- insert function -----
    void insert(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else tail.next = temp;
        tail = temp;
    }

    //     ---- set function -----
    int set(int idx, int val) {
        if (idx < 0 || idx <= size) {
            tail.val = val;
            System.out.println("invalid index");
            return -1;
        }
        if(idx == size -1){
            tail.val = val;
            return val;
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
        return val;
    }


//     ---- display function ----
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();       // next line
    }

//     ----- size method ----
    void size(){
        System.out.println("size : " + size);
    }
}
public class setElement{
    public static void main(String[] args){

        SET s = new SET();
        s.insert(10);
        s.insert(30);
        s.insert(34);
        s.insert(45);
        s.display();
        s.size();

        System.out.println(s.set(3, 94));
        s.display();
    }
}
