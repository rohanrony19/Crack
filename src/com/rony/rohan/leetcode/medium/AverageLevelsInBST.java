package com.rony.rohan.leetcode.medium;

import java.util.*;
// 637
// Google
/*
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [3.00000,14.50000,11.00000]
Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
Hence return [3, 14.5, 11].

Example 2:
Input: root = [3,9,20,15,7]
Output: [3.00000,14.50000,11.00000]
 */

public class AverageLevelsInBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val; this.left = left; this.right = right;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double sum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(sum / levelSize);
        }
        return result;
    }

    // ✅ Static buildTree method
    public static TreeNode buildTree(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        TreeNode[] nodes = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) nodes[i] = new TreeNode(arr[i]);
        }

        for (int i = 0; i < arr.length / 2; i++) {
            if (nodes[i] != null) {
                if (2 * i + 1 < arr.length) nodes[i].left = nodes[2 * i + 1];
                if (2 * i + 2 < arr.length) nodes[i].right = nodes[2 * i + 2];
            }
        }
        return nodes[0];
    }

    public static void main(String[] args) {
        AverageLevelsInBST level = new AverageLevelsInBST();
        int[] arr = {3, 9, 20, 0, 0, 15, 7};

        TreeNode root = buildTree(arr);  // ✅ Now works!
        List<Double> result = level.averageOfLevels(root);
        System.out.println(result);  // [3.0, 14.5, 11.0]
    }
}
