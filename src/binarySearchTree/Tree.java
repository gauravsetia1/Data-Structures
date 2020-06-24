package binarySearchTree;

import java.util.Scanner;

public class Tree {
        Node root;
        class Node{
            int key;
            Node left,right;
            public Node(int key){
                this.key = key;
                left = right = null;
            }
        }

        Tree(){
            root = null;
        }
        void insert(int key){
            root = insertNode(root,key);
        }
        Node insertNode(Node root,int key){
            if(root == null){
                root = new Node(key);
                return root;
            }
            if(key<root.key) {
                root.left = insertNode(root.left, key);
            }
            else if(key>root.key){
                root.right = insertNode(root.right,key);
            }
            else{
                System.out.println("{You  Have Entered a Duplicate Node}");
            }
            return root;
        }

        void inorder() {
            inorderRec(root);
        }
        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.key+ " ");
                inorderRec(root.right);
            }
        }

        void preorder() {
            preorderRec(root);
        }
        void preorderRec(Node root) {
            if (root != null) {
                System.out.print(root.key+ " ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        }

        void postorder() {
            postorderRec(root);
        }
        void postorderRec(Node root) {
            if (root != null) {
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.print(root.key+ " ");
            }
        }
        public static void main(String[] args) {
            Tree bst = new Tree();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter No. of Nodes To Be Inserted");
            int n = s.nextInt();
            for(int i=0;i<n;i++){
                bst.insert(s.nextInt());
            }
            System.out.print("Inorder -> {");
            bst.inorder();
            System.out.println("}");
            System.out.print("Preorder -> {");
            bst.preorder();
            System.out.println("}");
            System.out.print("Postorder -> {");
            bst.postorder();
            System.out.println("}");
        }
}
