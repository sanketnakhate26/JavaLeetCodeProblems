package com.leetcode;

class TreeNodeSymmetric
{
    int val;
    TreeNodeSymmetric left;
    TreeNodeSymmetric right;
    TreeNodeSymmetric() {};
    TreeNodeSymmetric(int val) {this.val=val; this.left=null; this.right=null;}
    TreeNodeSymmetric(int val, TreeNodeSymmetric left, TreeNodeSymmetric right)
    {
        this.val=val;
        this.left=left;
        this.right=right;
    }
}

public class SymmetricTree
{
    private static boolean isTreeSymmetric(TreeNodeSymmetric left, TreeNodeSymmetric right)
    {
        if(left == null && right == null)
            return true;
        else if( (left == null && right != null) || (left!=null && right==null))
            return false;
        else
        {
            return left.val== right.val && isTreeSymmetric(left.left, right.right);
        }
    }
    private static boolean isTreeSymmetric(TreeNodeSymmetric root)
    {
        if(root==null)
            return true;
        else
            return isTreeSymmetric(root.left, root.right);

    }
    public static void main(String[] args)
    {
        TreeNodeSymmetric root = new TreeNodeSymmetric(1,new TreeNodeSymmetric(2,new TreeNodeSymmetric(4,null,null),new TreeNodeSymmetric(3,null,null)),new TreeNodeSymmetric(2,new TreeNodeSymmetric(3,null,null),new TreeNodeSymmetric(4,null,null)));

        System.out.println(isTreeSymmetric(root));

    }
}
