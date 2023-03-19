package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Target
{
    public static int[] findTarget(int[] nums, Integer target)
    {
        HashMap<Integer,Integer> element = new HashMap<>();
        int[] output = {-1,-1};
        element.put(nums[0],0);
        for(int i=1; i<nums.length;i++)
        {
            int number = nums[i];
            int secondNumber = target - number;
            if(null != element.get(secondNumber))
            {
                output[0] = element.get(Integer.valueOf(secondNumber));
                output[1] = i;
                break;
            }
        }
        return output;
    }
    public static void main(String[] args)
    {
        int[] nums = {2,10,4,12,6,14,8,16};
        Integer target = 19;

        System.out.println("Target "+target+" is present at : "+ Arrays.toString(findTarget(nums, target)));
    }
}
