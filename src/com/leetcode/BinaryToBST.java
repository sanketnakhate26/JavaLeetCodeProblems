package com.leetcode;

class Tree3
{
    int val;
    Tree3 left;
    Tree3 right;
    Tree3() {}
    Tree3 (int val) {this.val=val; this.left=null; this.right=null; }
    Tree3 (int val, Tree3 left, Tree3 right) {this.val=val; this.left=left; this.right=right;}
}

public class BinaryToBST {
    private static void printInOrder(Tree3 root) {
        if (null != root)
        {
            printInOrder(root.left);
            System.out.print(root.val+" ");
            printInOrder(root.right);
        }
    }
    private static Tree3 binaryToBST(int[] list,int left, int right)
    {
        Tree3 root = new Tree3();
        if(left > right) return null;
        else{
            int mid = left + (right-left)/2;
            root.val=list[mid];
            root.left = binaryToBST(list,left,mid-1);
            root.right = binaryToBST(list,mid+1,right);
            return root;
        }
    }
    public static void main(String[] args)
    {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        Tree3 root = binaryToBST(list,0,list.length-1);
        System.out.println("Inorder traversal : ");
        printInOrder(root);

    }
}
