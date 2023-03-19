package com.leetcode;

import java.util.Arrays;

public class RobberProblemOptimized {
    public static void main(String[] args)
    {
        int[] nums = {2,7,9,3,1};

        int[] memory = new int[nums.length + 1];
        Arrays.fill(memory,-1);

        memory[0] = 0;
        memory[1] = nums[0];

        for(int i=1; i<nums.length;i++)
        {
            memory[i+1] = Math.max(memory[i-1] + nums[i] ,memory[i]);
        }
        System.out.println(memory[nums.length]);

    }
}
