package com.leetcode;

public class Target1
{
    public static boolean findTarget(int[] nums, Integer target)
    {
        int start =0, last = nums.length-1;
        int sum = nums[start] + nums[last];
        while(start < last && sum != target)
        {
            if(sum < target)
                start++;
            else
                last--;

            sum = nums[start] + nums[last];
        }
        if(sum == target)
            return true;
        else
            return false;

    }
    public static void main(String[] args)
    {
        int[] nums = {1,20,31,42,53,64,75,86,97,100};
        Integer target = 197;

        System.out.println("Target "+target+" is present at : "+findTarget(nums, target));
    }
}
