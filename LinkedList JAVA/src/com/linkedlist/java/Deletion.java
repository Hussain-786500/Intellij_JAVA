package com.linkedlist.java;

//   ----- create class -----
class DEL {
    Node head;
    Node tail;
    int size;

//      ------ insert AtTail -----
//    void insertAtTail(int val){
//        Node temp = new Node(val);
//        if(head == null) head = tail = temp;
//        else tail.next = temp;
//        tail = temp;
//
//        size++;
//    }

//     ------ insert AtHead ------
//    void insertAtHead(int val){
//        Node temp = new Node(val);
//        temp.next = head;
//        head = temp;
//        if(tail == null) tail = head;
//        size--;
//    }

    //    ----- insert function -----
    void insert(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else tail.next = temp;
        tail = temp;

        size++;
    }

    //    ----- delete function -----
    void deleteAtHead() {
        if (head == null) return;
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    void deleteAtTail() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) temp = temp.next;
            temp.next = null;
            tail = temp;
        }
        size--;
    }

    //    ------- Delete any index ------
    void deleteAtIndex(int idx) {
        if (idx < 0 || idx >= size) return;

//   Delete head.........
        if (idx == 0) {
            deleteAtHead();
            return;
        }
//   Delete tail........
            if (idx == size - 1) {
                deleteAtTail();
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

//     ----- display function -----
        void display () {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();       // next line
        }

//     ----- size function -----
        void size () {
            System.out.println("size of list -> " + size);
        }
    }

public class Deletion {
    public static void main(String[] args){

        DEL d = new DEL();
        d.insert(10);
        d.insert(20);
        d.insert(30);
        d.insert(40);
        d.insert(50);
        d.size();
        d.display();


        d.deleteAtIndex(2);
        d.display();
        d.size();
    }
}
