package org.example.linkedList;

public class SinglyLinkedList {
    public ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        System.out.println(sll.head.data);
        System.out.println(second.data);
        System.out.println(second.next);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        ListNode current = sll.head;
        while (current != null){
            System.out.print(current.data+ "-->");
            current = current.next;
        }
        System.out.print(forth.next);

    }
}
