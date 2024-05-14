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

    public int findLength(){
        ListNode temp = head;
        int count =0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+ "-->");
            current = current.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode forth = new ListNode(11);
//
//        sll.head.next = second;
//        second.next = third;
//        third.next = forth;
//
//        sll.display();
//        System.out.println("Length:"+sll.findLength());
        sll.insertFirst(10);
        sll.insertFirst(11);
        sll.insertFirst(18);

        sll.display();
    }
}
