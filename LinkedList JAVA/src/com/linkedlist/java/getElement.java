package com.linkedlist.java;

//  ---- create class ----

class GET {
    Node head;
    Node tail;
    int size;

    // ----- insert Function -----
    void insert(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++; // size update
    }

    // ----- get Function -----
      int get(int idx)throws Error{
        if(idx < 0 || idx >= size){       // Base case
//            System.out.println("Index out of range");
//            return -1;
            throw new Error("invalid index");
        }
        if (idx == size - 1) return tail.val;

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // ----- display Function -----
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ----- size method ----
    void printSize() {
        System.out.println("Size of list is: " + size);
    }
}

public class getElement {
    public static void main(String[] args) {

        GET obj = new GET();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.display();          // 10 20 30 40
        obj.printSize();        // Size of list is: 4

        System.out.println(obj.get(1)); // 20
//        System.out.println(obj.get(5));

    }
}
