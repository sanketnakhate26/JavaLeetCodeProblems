package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class TreeNodeSymmetricIterative
{
    int val;
    TreeNodeSymmetricIterative left;
    TreeNodeSymmetricIterative right;
    TreeNodeSymmetricIterative() {};
    TreeNodeSymmetricIterative(int val) {this.val=val; this.left=null; this.right=null;}
    TreeNodeSymmetricIterative(int val, TreeNodeSymmetricIterative left, TreeNodeSymmetricIterative right)
    {
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class SymmetricTreeIterative {
    public static void main(String[] args)
    {
        TreeNodeSymmetricIterative root = new TreeNodeSymmetricIterative(1,new TreeNodeSymmetricIterative(2,new TreeNodeSymmetricIterative(4,null,null),new TreeNodeSymmetricIterative(3,null,null)),new TreeNodeSymmetricIterative(2,new TreeNodeSymmetricIterative(3,null,null),new TreeNodeSymmetricIterative(4,null,null)));

        System.out.println(isTreeSymmetric(root));
    }
    private static boolean isTreeSymmetric(TreeNodeSymmetricIterative root)
    {
        if(root==null)
            return true;

        Queue<TreeNodeSymmetricIterative> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNodeSymmetricIterative p = queue.poll();
            TreeNodeSymmetricIterative q = queue.poll();

            if((p==null && q!=null) || (p!=null && q==null))
                return false;
            else if(p==null && q== null)
                return true;
            else if(p.val != q.val)
                return false;

            queue.add(p.left); queue.add(q.right);
            queue.add(p.right); queue.add(q.left);
        }
        return true;

    }
}
