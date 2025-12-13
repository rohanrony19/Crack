package com.rohan.leetcode.medium;
// 105
// Amazon - imp
/*
Example 1:
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]

Example 2:
Input: preorder = [-1], inorder = [-1]
Output: [-1]
 */

import java.util.Arrays;

public class ConstructBTFromPreAndIn {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length == 0){
            return null;
        }

        int r = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == r){
                index = i;
            }
        }

        TreeNode node = new TreeNode(r);

        node.left = buildTree(Arrays.copyOfRange(preorder,1,index + 1),Arrays.copyOfRange(inorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(preorder,index + 1,preorder.length),Arrays.copyOfRange(inorder,index + 1,inorder.length));

        return node;
    }

    public static void main(String[] args) {
        ConstructBTFromPreAndIn sol = new ConstructBTFromPreAndIn();

        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = sol.buildTree(preorder, inorder);

        // Print level order structure
        System.out.print(root.val + " ");      // 3
        System.out.print(root.left.val + " "); // 9
        System.out.print(root.right.val + " "); // 20
        System.out.println(root.right.left.val + " " + root.right.right.val); // 15 7
    }
}
