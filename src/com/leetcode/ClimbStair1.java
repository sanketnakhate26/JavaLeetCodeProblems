package com.leetcode;

public class ClimbStair1 {
    public static long climbStair1(long n)
    {
        if(n == 0 || n == 1)
            return 1;
        else
            return climbStair1(n-1) + climbStair1(n-2);
    }
    public static void main(String[] args)
    {
        long n = 50;
        System.out.println(climbStair1(n));
    }
}
