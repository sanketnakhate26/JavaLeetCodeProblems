package com.leetcode;

class Tree1
{
    int val;
    Tree1 left;
    Tree1 right;
    Tree1() {};
    Tree1(int val) {this.val=val; this.left=null; this.right=null;}
    Tree1(int val, Tree1 left, Tree1 right)
    {
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class DepthBinaryTree 
{
    private static int depthTree(Tree1 root)
    {
        if(null == root)
            return 0;
        else
            return 1 + Math.max(depthTree(root.left),depthTree(root.right));
    }
    public static void main(String[] args)
    {
        Tree1 tree1 = new Tree1(5,new Tree1(10,new Tree1(20,new Tree1(67,new Tree1(78),null),null),new Tree1(30,new Tree1(90),null)),new Tree1(50,new Tree1(60,null,null),new Tree1(70,null,null)));

        System.out.println(depthTree(tree1));
    }
}
