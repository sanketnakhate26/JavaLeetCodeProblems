package com.leetcode;

public class MaximumSubarray
{
    public static int maximumSubarray(int[] input)
    {
        int COUNT = Integer.MIN_VALUE;
        int localCount = 0;
        int i = 0;
        while (i < input.length)
        {
            localCount = Math.max(0, localCount) + input[i];
            COUNT = Math.max(COUNT,localCount);
            i++;
        }
        return COUNT;
    }
    public static void main(String[] args)
    {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSubarray(input));

    }
}
