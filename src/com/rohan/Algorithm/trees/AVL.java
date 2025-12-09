package com.rohan.Algorithm.trees;

public class AVL {
    public class Node {
        int value;  // FIXED: Typo vslue → value
        Node left;
        Node right;
        int height;

        public Node(int value) {  // FIXED: Parameter name
            this.value = value;
            this.height = 1;
        }
    }

    private Node root;

    public AVL() {}

    public int height() {  // FIXED: Public height method
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {  // FIXED: else if + ==
            node.right = insert(value, node.right);
        }

        // FIXED: Update height BEFORE rotation
        node.height = 1 + Math.max(height(node.left), height(node.right));

        return rotate(node);  // FIXED: Missing return
    }

    private Node rotate(Node node) {
        int balance = height(node.left) - height(node.right);

        // Left Heavy
        if (balance > 1) {
            if (height(node.left.left) >= height(node.left.right)) {
                return rightRotate(node);  // LL
            }
            node.left = leftRotate(node.left);  // LR
            return rightRotate(node);
        }

        // Right Heavy
        if (balance < -1) {
            if (height(node.right.right) >= height(node.right.left)) {
                return leftRotate(node);  // RR
            }
            node.right = rightRotate(node.right);  // RL
            return leftRotate(node);
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = 1 + Math.max(height(p.left), height(p.right));
        c.height = 1 + Math.max(height(c.left), height(c.right));
        return c;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = 1 + Math.max(height(p.left), height(p.right));
        c.height = 1 + Math.max(height(c.left), height(c.right));
        return p;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) return;
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + ": ");
        display(node.right, "Right child of " + node.value + ": ");
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            insert(num);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }
    
    public static void main(String[] args) {
        AVL tree = new AVL();

        // Test 1: Sequential insert (should balance to height ~10)
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println("Sequential height: " + tree.height());
        System.out.println("Balanced: " + tree.balanced());

        // Test 2: Sorted array (should be perfectly balanced ~10)
        tree = new AVL();
        int[] sorted = new int[1000];
        for (int i = 0; i < 1000; i++) sorted[i] = i;
        tree.populateSorted(sorted);
        System.out.println("Sorted height: " + tree.height());
    }
}
