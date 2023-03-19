package com.leetcode;

public class ClimbStair2 
{
    public static long climbStair2(int n, long[] memory)
    {
        if(n == 0 || n == 1)
            return 1;
        else if(memory[n] != 0)
            return memory[n];
        else
        {
            memory[n] = climbStair2(n-1,memory) + climbStair2(n-2,memory);
            return memory[n];
        }


    }
    public static void main(String[] args)
    {
        int n = 1000;
        long[] memory = new long[n+1];
        System.out.println(climbStair2(n,memory));
    }
}
