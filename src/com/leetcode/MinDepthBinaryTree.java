package com.leetcode;
class Tree4
{
    int val;
    Tree4 left;
    Tree4 right;
    Tree4() {}
    Tree4(int val) {this.val = val; }
    Tree4(int val, Tree4 left, Tree4 right) {this.val=val; this.left=left; this.right=right;}
}

public class MinDepthBinaryTree {
    public static void main(String[] args)
    {
        Tree4 root = new Tree4(20, new Tree4(10, new Tree4(5), new Tree4(15,new Tree4(12),null)), new Tree4(30,new Tree4(10),null));

        System.out.println("Min height : "+getMinDepth(root));

    }
    public static int getMinDepth(Tree4 root)
    {
        return root == null ? 0 : getDepth(root);
    }
    private static int getDepth(Tree4 root)
    {
        if(root==null) return Integer.MAX_VALUE;
        if(root.left == null && root.right==null) return 1;
        return Math.min(getDepth(root.left),getDepth(root.right)) + 1;
    }
    public static void printPreOrder(Tree4 root) {
        if (null != root)
        {
            System.out.print(root.val+" ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }
}
