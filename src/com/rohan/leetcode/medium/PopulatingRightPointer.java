package com.rohan.leetcode.medium;

public class PopulatingRightPointer {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMost = root;

        while (leftMost.left != null) {
            Node current = leftMost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    public static void main(String[] args) {
        PopulatingRightPointer sol = new PopulatingRightPointer();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        sol.connect(root);

        // Print serialized output: [1,#,2,3,#,4,5,6,7,#]
        printSerialized(root);
    }

    public static void printSerialized(Node root) {
        java.util.List<String> result = new java.util.ArrayList<>();

        // Follow NEXT pointers level by level
        Node head = root;
        while (head != null) {
            Node curr = head;
            while (curr != null) {
                result.add(String.valueOf(curr.val));
                curr = curr.next;
            }
            result.add("#");

            // Move to next level (leftmost child)
            head = head.left;
        }

        System.out.println(result);  // [1, 2, 3, #, 4, 5, 6, 7, #]
    }
}

