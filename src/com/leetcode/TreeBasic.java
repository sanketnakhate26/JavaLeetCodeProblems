package com.leetcode;

class Tree
{
    int val;
    Tree left;
    Tree right;
    Tree() {}
    Tree(int val) {this.val = val; }
    Tree(int val, Tree left, Tree right) {this.val=val; this.left=left; this.right=right;}
}

public class TreeBasic {
    public static void printPreOrder(Tree root) {
        if (null != root)
        {
            System.out.print(root.val+" ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }
    public static void printInOrder(Tree root) {
        if (null != root)
        {
            printInOrder(root.left);
            System.out.print(root.val+" ");
            printInOrder(root.right);
        }
    }
    public static void printPostOrder(Tree root) {
        if (null != root)
        {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.val+" ");
        }
    }
    public static void main(String[] args) {
        Tree root = new Tree();
        root = new Tree(20, new Tree(10, new Tree(5, null, null), new Tree(15, null, null)), new Tree(30, null, null));

        //print preorder
        System.out.print("Preorder : ");
        printPreOrder(root);
        System.out.println();
        System.out.print("Inorder : ");
        //print Inorder
        printInOrder(root);
        System.out.println();
        System.out.print("Postorder : ");
        //print PostOrder
        printPostOrder(root);
    }

}
