package com.rohan.leetcode.hard;

import java.util.LinkedList;
import java.util.Queue;
// 297
// Facebook, Amazon , Google
/*
Example 1:
Input: root = [1,2,3,null,null,4,5]
Output: [1,2,3,null,null,4,5]

Example 2:
Input: root = []
Output: []
 */

public class SerializeAndDeserializeBT {
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

     public static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "[]";

            StringBuilder sb = new StringBuilder("[");
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node == null) {
                    sb.append("null,");
                } else {
                    sb.append(node.val).append(",");
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if (sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("]");
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.equals("[]")) return null;

            String[] values = data.substring(1, data.length() - 1).split(",");
            Queue<TreeNode> queue = new LinkedList<>();

            TreeNode root = new TreeNode(Integer.parseInt(values[0]));
            queue.offer(root);
            int i = 1;

            while (!queue.isEmpty() && i < values.length) {
                TreeNode parent = queue.poll();

                if (!values[i].equals("null") && i < values.length) {
                    parent.left = new TreeNode(Integer.parseInt(values[i]));
                    queue.offer(parent.left);
                }
                i++;

                if (i < values.length && !values[i].equals("null")) {
                    parent.right = new TreeNode(Integer.parseInt(values[i]));
                    queue.offer(parent.right);
                }
                i++;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Codec ser = new Codec();
        Codec deser = new Codec();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        String data = ser.serialize(root);
        System.out.println(data);  // [1,2,3,null,null,null,null]

        TreeNode ans = deser.deserialize(data);
        System.out.println(ans.val);  // 1
    }
}
