package com.rony.rohan.leetcode.medium;
// 114 - preOrder
// Facebook
/*
Example 1:
        1
  ---2---    5---
 3      4       6
        ||
 1
    2
        3
            4
                5
                    6
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [0]
Output: [0]
 */

public class FlattenBinaryTreeToLL {
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

    public void flatten(TreeNode root) {
        TreeNode current = root;
        while (current != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while (temp.right != null){
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    public static void main(String[] args) {
        FlattenBinaryTreeToLL sol = new FlattenBinaryTreeToLL();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        sol.flatten(root);

        // Print flattened list: 1→2→3→4→5→6
        TreeNode curr = root;
        while(curr != null) {
            System.out.print(curr.val + "→");
            curr = curr.right;
        }
        System.out.println("null");
    }
}
