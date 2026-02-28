package com.linkedlist.java;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class  MiddleLink{
//     -------- for show middle val --------
public static ListNode showMiddle(ListNode head){

    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

//     -------- for delete middle val --------
    public static ListNode deleteMiddle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }

//     ------- display function ------
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);

        ListNode show = showMiddle(head);
        System.out.println("middle node val " + show.val);

        ListNode l1 = deleteMiddle(head);
        display(head);

    }
}
