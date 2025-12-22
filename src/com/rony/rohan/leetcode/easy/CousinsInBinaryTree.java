package com.rony.rohan.leetcode.easy;
// 993
/*
Example 1:
Input: root = [1,2,3,4], x = 4, y = 3
Output: false

Example 2:
Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true

Example 3:
Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
 */

public class CousinsInBinaryTree {
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

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);

        return (
                (level(root,xx,0) == level(root,yy,0)) && (!isSibling(root,xx,yy))
                );
    }

    TreeNode findNode(TreeNode node,int x){
         if(node == null){
             return null;
         }
         if (node.val == x){
             return node;
         }
         TreeNode n = findNode(node.left,x);
         if(n != null){
             return n;
         }
         return findNode(node.right,x);
    }

    boolean isSibling(TreeNode node,TreeNode x,TreeNode y){
         if(node == null){
             return false;
         }

         return (
                 (node.left == x && node.right == y) || (node.left == y && node.right == x) || isSibling(node.left,x,y) || isSibling(node.right,x,y)
                 );
    }

    int level(TreeNode node, TreeNode x, int lev){
         if(node == null){
             return 0;
         }
         if (node == x){
             return lev;
         }

         int l = level(node.left,x,lev+1);
         if(l != 0){
             return l;
         }
         return level(node.right,x,lev+1);
    }

    public static void main(String[] args) {
        CousinsInBinaryTree sol = new CousinsInBinaryTree();

        // Example 1: [1,2,3,4], x=4, y=3 → false (same parent)
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        System.out.println(sol.isCousins(root1, 4, 3));  // false

        // Example 2: [1,2,3,null,4,null,5], x=5, y=4 → true (same level, different parents)
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(5);
        System.out.println(sol.isCousins(root2, 5, 4));  // true

        // Example 3: [1,2,3,null,4], x=2, y=3 → false (different levels)
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.right = new TreeNode(4);
        System.out.println(sol.isCousins(root3, 2, 3));  // false
    }
}
