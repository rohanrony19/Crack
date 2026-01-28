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

    public void deleteElement(int data){
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

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
