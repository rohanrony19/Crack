package com.rony.rohan.leetcode.easy;
// 543 - postOrder traversal
/*
Example 1:
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Example 2:
Input: root = [1,2]
Output: 1
 */

public class DiameterOfBinaryTree {
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
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;  // Reset for each call
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight;  // Fixed: nodes-1 = heights sum
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree sol = new DiameterOfBinaryTree();

        // Example 1: [1,2,3,4,5] → 3
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        System.out.println(sol.diameterOfBinaryTree(root1));  // 3

        // Example 2: [1,2] → 1
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        System.out.println(sol.diameterOfBinaryTree(root2));  // 1
    }
}

