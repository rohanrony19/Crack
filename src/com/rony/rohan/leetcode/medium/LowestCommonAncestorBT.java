package com.rony.rohan.leetcode.medium;
// 236
/*
Example 1:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.

Example 2:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

Example 3:
Input: root = [1,2], p = 1, q = 2
Output: 1
 */

public class LowestCommonAncestorBT {
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if(root == p  || root == q){
            return root;
        }

        TreeNode left  = lowestCommonAncestor(root.left,p,q);
        TreeNode right  = lowestCommonAncestor(root.right,p,q);

        if(left != null && right != null){
            return root;
        }
        return left == null ? right : left;
    }

    public static void main(String[] args) {
        LowestCommonAncestorBT sol = new LowestCommonAncestorBT();

        // Example 1: root=[3,5,1,6,2,0,8,null,null,7,4], p=5, q=1 → 3
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5); root.right = new TreeNode(1);
        root.left.left = new TreeNode(6); root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0); root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7); root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;      // 5
        TreeNode q = root.right;     // 1
        TreeNode lca = sol.lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);  // 3

        // Example 2: p=5, q=4 → 5
        TreeNode p2 = root.left;     // 5
        TreeNode q2 = root.left.right.right;  // 4
        lca = sol.lowestCommonAncestor(root, p2, q2);
        System.out.println(lca.val);  // 5
    }
}
