package com.rony.dsa.arrays.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.addLast(80);

        ll.print();

        ll.findMiddle();

        ll.head = ll.reverse();

        ll.print();

        LinkedList ll1 = new LinkedList();
        ll1.addFirst(10);
        ll1.addFirst(20);
        ll1.addFirst(30);
        ll1.addFirst(40);
        ll1.addFirst(50);

        ll1.print();

        ll1.findMiddle();

        ll1.deleteNode(30);
        ll1.deleteNode(50);

        ll1.print();


        

        System.out.println(ll1.hasCycle());

        ll1.insertAtPosition(69,3);

//        ll.removeCycle();
//        ll.print();

    }
}
