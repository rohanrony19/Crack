package com.rony.dsa.arrays.linkedlist;

public class ReverseK {
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

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    Node reversek(Node head,int k){
        Node curr = head;
        Node prev = null;

        int count = 0;
        while (curr != null && count < k){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(curr != null){
            head.next = reversek(curr, k);
        }
        return prev;
    }

    public static void main(String[] args) {

        ReverseK rev = new ReverseK();

        rev.addLast(1);
        rev.addLast(2);
        rev.addLast(3);
        rev.addLast(4);
        rev.addLast(5);
        rev.addLast(6);

        System.out.println("Before:");
        rev.print();

        int k = 2;
        rev.head = rev.reversek(rev.head,k);

        System.out.println("After reversing in groups of " + k + " : ");
        rev.print();
    }
}
