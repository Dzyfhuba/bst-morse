package javaapplication39;

import java.util.LinkedList;

class BinarySearchTree {

    Node root;

    static class Node {

        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    BinarySearchTree(int key) {
        root = new Node(key);
    }

    BinarySearchTree() {
        root = null;
    }

    static int i = 0;
    static LinkedList l = new LinkedList();

    static String count = "";

    static void inorder(Node node) {

//        System.out.print(l);
        if (node == null) {
//            i--;
//            l.removeLast();
//            for (int j = 0; j < l.size(); j++) {
//                System.out.print(l);
//            }
            return;
        }
        i++;
        if (node.left != null) {
//            System.out.print("\u2190");
//            l.push("\u2190");
//            System.out.print(l);
            count += "\u2190";
            System.out.print(count);
            inorder(node.left);
        }
//        System.out.print(l);
        System.out.print(node.key + " ");
        if (node.right != null) {
//            System.out.print("\u2192");
//            l.push("\u2192");
//            System.out.print(l);
            count += "\u2192";
            System.out.print(count);
            inorder(node.right);
        }
        System.out.print(count);
        count = count.substring(count.length() - 1);

//        System.out.print(l);
//        l.pop();
//        System.out.print(l);
    }

    void inorder() {
        inorder(root);
    }

    char[] convert(String mentah) {
        char[] hasil = mentah.toCharArray();
        return hasil;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(11);
        tree.root.left = new Node(6);
        tree.root.left.left = new Node(2);
        tree.root.left.left.left = new Node(1);
        tree.root.left.left.right = new Node(4);
        tree.root.left.right = new Node(10);
        tree.root.left.right.left = new Node(9);
        tree.root.right = new Node(21);
        tree.root.right.left = new Node(17);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(19);

        System.out.print("inorder\t\t: ");
        tree.inorder();
        System.out.println();

        System.out.println(tree.convert("1,2,3,5"));
    }
}
