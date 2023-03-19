package com.leetcode;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val=val; this.left=null; this.right=null;}
    TreeNode(int val, TreeNode left, TreeNode right) { this.val=val; this.left=left; this.right=right;}

}
public class SameTree {
    public static void main(String[] args)
    {
        TreeNode tree1 = new TreeNode();
        TreeNode tree2 = new TreeNode();
        tree1 = new TreeNode(5,new TreeNode(10,new TreeNode(20,null,null),new TreeNode(30,null,null)),new TreeNode(50,new TreeNode(60,null,null),new TreeNode(70,null,null)));
        tree2 = new TreeNode(5,new TreeNode(10,new TreeNode(20,null,null),new TreeNode(30,null,null)),new TreeNode(50,new TreeNode(60,null,null),new TreeNode(70,null,null)));

        System.out.println(sameTree(tree1,tree2));
    }
    public static boolean sameTree(TreeNode root1, TreeNode root2)
    {
        if(null==root1 && null==root2)
            return true;
        else if( (root1==null && root2 != null) || (root1!=null && root2==null))
            return false;
        else{
            if(root1.val == root2.val)
                return sameTree(root1.left,root2.left)&&sameTree(root1.right,root2.right);
            else
                return false;
        }
    }
}
