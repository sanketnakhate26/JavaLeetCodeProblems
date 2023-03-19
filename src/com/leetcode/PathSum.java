package com.leetcode;
class Tree5
{
    int val;
    Tree5 left;
    Tree5 right;
    Tree5() {}
    Tree5(int val) {this.val = val; }
    Tree5(int val, Tree5 left, Tree5 right) {this.val=val; this.left=left; this.right=right;}
}
public class PathSum {
    public static void main(String[] args)
    {

        Tree5 root = new Tree5(20, new Tree5(10, new Tree5(5, null, null), new Tree5(15, null, null)), new Tree5(30, null, null));
        int target = 35;
        System.out.println(hasPathSum(root,0, target));
    }
    public static boolean hasPathSum(Tree5 root,int sum, int target)
    {
        if(root==null) return false;
        sum += root.val;

        if(root.left==null && root.right==null)
        {
            return sum == target;
        }
        return hasPathSum(root.left,sum,target) || hasPathSum(root.right,sum,target);
    }
}
