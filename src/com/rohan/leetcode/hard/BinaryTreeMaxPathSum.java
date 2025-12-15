package com.rohan.leetcode.hard;
// 124
// Microsoft
/*
Example 1:
Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

Example 2:
Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 */

import com.rohan.Algorithm.trees.BinaryTree;
import com.rohan.leetcode.medium.SumRootToLeafNumbers;

public class BinaryTreeMaxPathSum {
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

    static int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    public static int helper(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathSum = left + right + node.val;

        ans = Math.max(ans,pathSum);

        return Math.max(left,right) + node.val;
    }

    public static boolean findPath(TreeNode node,int[] arr){
        if(node == null){
            return arr.length == 0;
        }
        return helper(node,arr,0);
    }

    public static boolean helper(TreeNode node,int[] arr,int index){
        if(node == null){
            return false;
        }

        if(index >= arr.length || node.val != arr[index]){
            return false;
        }

        if (node.left == null && node.right == null && index == arr.length - 1){
            return true;
        }

        return helper(node.left,arr,index + 1) || helper(node.right,arr,index + 1);
    }

    public static void main(String[] args) {
        BinaryTreeMaxPathSum sol = new BinaryTreeMaxPathSum();

        // Example: [-10,9,20,null,null,15,7]
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(sol.maxPathSum(root));  // 42

        // arr = {1,2,5,3,4,6}
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(5);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.right = new TreeNode(6);

        int[] path1 = {1,2,3};
        System.out.println(sol.findPath(root1, path1));  // true

        int[] path2 = {1,5,6};
        System.out.println(sol.findPath(root1, path2));  // true

        int[] path3 = {1,2,10};
        System.out.println(sol.findPath(root1, path3));  // false
    }
}
