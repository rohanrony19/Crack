package com.rony.rohan.Algorithm.trees.dfs;

import java.util.Stack;

public class DFSUsingStack {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(){}
        Node(int value) {
            this.value = value;
        }
        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public void dfsStack(Node node){
        if(node == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()){
            Node removed = stack.pop();
            System.out.print(removed.value + " ");
            if (removed.right != null){
                stack.push(removed.right);
            }
            if (removed.left != null){
                stack.push(removed.left);
            }
        }
    }

    public static void main(String[] args) {
        DFSUsingStack sol = new DFSUsingStack();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        sol.dfsStack(root);  // 1 2 4 5 3 ✅
    }
}
