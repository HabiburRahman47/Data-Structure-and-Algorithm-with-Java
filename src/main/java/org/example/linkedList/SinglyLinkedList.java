package org.example.linkedList;

class Result{
    private boolean success;
    private Integer value;
    public Result(boolean success, Integer value){
        this.success = success;
        this.value = value;
    }
    public boolean isSuccess(){
        return success;
    }
    public Integer getValue(){
        return value;
    }
}

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

    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    public ListNode deleteLast1(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    public ListNode deleteLast2(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        ListNode last = temp.next;
        temp.next = null;
        return last;
    }

    public void deleteAt(int position){
        if (position == 1){
            head = head.next;
        }else {
            ListNode current = head;
            ListNode prevoious = null;
            int count = 1;
            while (count<position){
                prevoious = current;
                current = current.next;
                count++;
            }
            prevoious.next = current.next;
            current.next = null;
        }

    }

    public Result find(int searchKey){
        int count = 1;
        ListNode current = head;
        while (current != null){
            if (current.data == searchKey){
                return new Result(true, count);
            }
            count++;
            current = current.next;
        }
        return new Result(false, null);
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
        sll.deleteAt(5);
        sll.display();

        int searchKey = 40;
        Result result = sll.find(searchKey);
        if (result.isSuccess()){
            System.out.println("Element: "+ searchKey+ "found at: "+result.getValue()+" position");
        }else {
            System.out.println("Element: "+ searchKey+ " not found.");
        }

    }
}
