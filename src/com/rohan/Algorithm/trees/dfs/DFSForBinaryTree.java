package com.rohan.Algorithm.trees.dfs;

public class DFSForBinaryTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }



    
    public static class BinaryTreeDFS {

        // Preorder DFS (Root - Left - Right)
        void preorder(Node root) {
            if (root == null) return;

            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Inorder DFS (Left - Root - Right)
        void inorder(Node root) {
            if (root == null) return;

            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }

        // Postorder DFS (Left - Right - Root)
        void postorder(Node root) {
            if (root == null) return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }

        public static void main(String[] args) {

            // Build a sample tree:
            //
            //          10
            //        /    \
            //       5      20
            //      / \       \
            //     3   7       25
            //

            Node root = new Node(10);
            root.left = new Node(5);
            root.right = new Node(20);
            root.left.left = new Node(3);
            root.left.right = new Node(7);
            root.right.right = new Node(25);

            BinaryTreeDFS tree = new BinaryTreeDFS();

            System.out.print("Preorder   : ");
            tree.preorder(root);
            System.out.println();

            System.out.print("Inorder    : ");
            tree.inorder(root);
            System.out.println();

            System.out.print("Postorder  : ");
            tree.postorder(root);
            System.out.println();
        }
    }
}
