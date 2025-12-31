package com.rony.rohan.Collections.problems.list;

public class CycleStart {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node findCycleStart(Node head) {

        Node slow = head;
        Node fast = head;

        // Phase 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break; // cycle detected
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Phase 2: Find cycle start
        fast = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // cycle start
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3; // 🔁 cycle starts at 3

        Node start = findCycleStart(n1);
        System.out.println(start.data); // 3
    }
}
