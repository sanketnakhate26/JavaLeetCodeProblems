package com.leetcode;

import java.util.*;

class Tree2
{
    int val;
    Tree2 left;
    Tree2 right;
    Tree2() {};
    Tree2(int val) {this.val=val; this.left=null; this.right=null;}
    Tree2(int val, Tree2 left, Tree2 right)
    {
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class LevelOrderTraversalBinaryTree {
    private static LinkedList<Tree2> levelOrderTraversal(Tree2 root)
    {
        Queue<Tree2> queue = new LinkedList<Tree2>();
        LinkedList<Tree2> result = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty())
        {
            Tree2 node = queue.poll();
            if(null != node)
            {
                result.add(root);
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        return result;
    }
    public static void main(String[] args)
    {
        Tree2 tree2 = new Tree2(5,new Tree2(10,new Tree2(20,new Tree2(67,new Tree2(78),null),null),new Tree2(30,new Tree2(90),null)),new Tree2(50,new Tree2(60),new Tree2(70)));

        LinkedList<Tree2> result = levelOrderTraversal(tree2);
        System.out.println(result);
    }

}
