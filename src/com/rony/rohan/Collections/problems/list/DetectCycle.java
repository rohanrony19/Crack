package com.rony.rohan.Collections.problems.list;

public class DetectCycle {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean hasCycle(Node head) {

        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;           // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                return true;            // 🔁 cycle found
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;   // 🔁 cycle here

        System.out.println(hasCycle(n1)); // true
    }
}
