package com.leetcode;

public class ClimbStair3 {
    public static long climbStair3(int n)
    {
        if(n == 0 || n == 1)
            return 1;
        else{
            long[] ways = new long[n + 1];
            ways[0] = 1;
            ways[1] = 1;

            for(int i = 2; i <= n ; i++)
                ways[i] = ways[i-1] + ways[i-2];

            return ways[n];

        }
    }
    public static void main(String[] args)
    {
        int n = 100;
        System.out.println(climbStair3(n));
    }
}
