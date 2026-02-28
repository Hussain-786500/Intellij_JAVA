package com.linkedlist.java;

class MOD {
    Node head;
    Node tail;
    int size;

    // insert at tail
    void insert(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    // reverse k group
    Node reverseKGroup(Node head, int k) {
        Node temp = head;

        // check k nodes
        for (int i = 0; i < k; i++) {
            if (temp == null) return head;
            temp = temp.next;
        }

        // reverse k nodes
        Node prev = null, curr = head, next;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // recursion
        head.next = reverseKGroup(curr, k);

        return prev;
    }

    // display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
class old {
    public static void main(String[] args) {

        MOD m = new MOD();

        m.insert(1);
        m.insert(2);
        m.insert(3);
        m.insert(4);
        m.insert(5);

        m.display();   // 1 2 3 4 5

        m.head = m.reverseKGroup(m.head, 3);

        m.display();   // 2 1 4 3 5
    }
}

