package com.rony.rohan.Collections.List;

public class Nodes {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node1.value = 1;
        node1.next = node2;
        node2.value = 2;
        node2.next = node3;
        node3.value = 3;
        node3.next = null;
    }

    static class Node{
        public int value;

        public Node next;
    }
}
