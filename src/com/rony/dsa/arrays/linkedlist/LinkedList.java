package com.rony.dsa.arrays.linkedlist;

public class LinkedList {
    Node head;
    Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteNode(int data){
        Node tail = head;
        if(head == null) {
            return;
        }
        if(head.data == data){
            head = tail.next;
            return;
        }
        while(tail.next != null && tail.next.data != data ){
            tail = tail.next;
        }
        tail.next = tail.next.next;

    }

    public void findMiddle(){
        Node temp = head;
        if(temp == null){
            System.out.println("null");
        }
        Node slow = temp;
        Node fast = temp;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public Node reverse(){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node insertAtPosition(int data, int pos) {

        Node newNode = new Node(data);

        // case 1: insert at beginning
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node temp = head;

        // move to (pos-1)th node
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // position out of range
        if (temp == null) {
            return head;
        }

        // link insertion
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }


    public boolean hasCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        Node slow = head;
        Node fast = head;

        do{
            slow = slow.next;
            fast = fast.next.next;
        }while (slow != fast);

        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }



    
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
