package com.leetcode;

public class RobberProblem {
    public static int rob(int[] input, int i)
    {
        //base
        if(i < 0)
            return 0;
        // recursive
        return Math.max(rob(input,i-2) + input[i],rob(input,i-1));
    }
    public static void main(String[] args)
    {
        int[] nums = {2,7,9,3,1};

        System.out.println(rob(nums,nums.length-1));

    }
}
