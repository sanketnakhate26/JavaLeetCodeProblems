package com.leetcode;

public class ClimbStair4
{
    public static long climbStair4(int n)
    {
        long ways0 = 1;
        long ways1 = 1;

        for(int i=2; i<=n; i++)
        {
            long ways = ways0 + ways1;
            ways1 = ways0;
            ways0 = ways;
        }

        return ways0;
    }
    public static void main(String[] args)
    {
        int n = 100;
        System.out.println(climbStair4(n));
    }
}
