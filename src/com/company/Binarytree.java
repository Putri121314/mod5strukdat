package com.company;

public class Binarytree {
        public Node root;

        public void NewNode(int data) {
            root = NewNode(root, new Node(data));
        }
        private Node NewNode(Node root, Node newData) {
            if (root == null) {
                root = newData;
                return root;
            }
            if (newData.data < root.data) {
                root.left = NewNode(root.left, newData);
            }
            else {
                root.right = NewNode(root.right, newData);
            }
            return root;
        }
        public void inOrder(Node node) {
            if (node != null){
                inOrder(node.left);
                System.out.print(node.data + " ");
                inOrder(node.right);

            }
        }
        public void preOrder(Node node){
            if (node !=null){
                System.out.print(node.data + " ");
                preOrder(node.left);
                preOrder(node.right);

            }
        }
        public void PostOrder(Node node){
            if (node !=null){
                PostOrder(node.left);
                PostOrder(node.right);
                System.out.print(node.data + " ");

            }

        }
    }


