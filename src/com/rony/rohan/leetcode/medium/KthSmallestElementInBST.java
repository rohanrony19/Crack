package com.rony.rohan.leetcode.medium;
// 230
// Facebook. Google, Amazon
/*
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
 */

public class KthSmallestElementInBST {
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

    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root,k).val;
    }

    public TreeNode helper(TreeNode root, int k) {
        if(root == null){
            return null;
        }

        TreeNode left  = helper(root.left,k);

        if(left != null){
            return left;
        }

        count++;

        if(count == k){
            return root;
        }
        return helper(root.right,k);
    }

    public static void main(String[] args) {
        KthSmallestElementInBST sol = new KthSmallestElementInBST();

        // Test 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        root1.right.left = new TreeNode(2);
        sol.count = 0;  // RESET!
        System.out.println(sol.kthSmallest(root1, 1));  // 1

        // Test 2
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(6);
        root2.left.left = new TreeNode(2);
        root2.left.right = new TreeNode(4);
        root2.left.left.left = new TreeNode(1);
        sol.count = 0;  // RESET!
        System.out.println(sol.kthSmallest(root2, 3));  // 3
    }
}
