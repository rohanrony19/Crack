package com.rony.rohan.Collections.problems.ll;

public class TraverseLinkedList {
    static class Node{
        int data;
        Node next; // just a Node box referring to the next (->)

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printLast(head);
    }

    static void printLast(Node head){
        Node current = head;

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
