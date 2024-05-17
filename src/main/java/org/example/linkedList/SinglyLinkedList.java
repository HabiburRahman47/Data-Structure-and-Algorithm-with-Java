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

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value){
        // 1->3->null
        // 1 -> 2 -> 3 -> null
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        }else {
            int count = 1;
            ListNode previous = head;
            while (count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public void printNodeValueWithPosition(){
        ListNode current = head;
        int count = 1;
        while (current != null){
            System.out.println("Position: "+ count+"-->"+current.data);
            current = current.next;
            count++;
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+ " -> ");
            current = current.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1, 2); // 2 -> null
        sll.insert(2, 4); // 2 -> 4 -> null
        sll.insert(3, 6); // 2 -> 4 -> 6 -> null
        sll.insert(1, 1); // 1 -> 2 -> 4 -> 6 -> null
        sll.insert(2, 8); // 2 -> 8 -> 4 -> 6 -> null
        sll.display();
    }
}
