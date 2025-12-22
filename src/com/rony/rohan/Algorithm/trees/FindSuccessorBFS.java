package com.rony.rohan.Algorithm.trees;

import java.util.LinkedList;
import java.util.Queue;

public class FindSuccessorBFS {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            // ✅ FIX 2: Proper level loop structure
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {  // Add for loop
                TreeNode currentNode = queue.poll();
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
                if (currentNode.val == key) {
                    return queue.peek();  // ✅ FIX 3: return inside if
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(12);

        TreeNode successor = findSuccessor(root, 8);
        System.out.println(successor != null ? successor.val : "null");  // 12
    }
}
