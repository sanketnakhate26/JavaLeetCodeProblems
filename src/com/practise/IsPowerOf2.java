package com.practise;

public class IsPowerOf2 {
    public static boolean isPowerOf2(int n)
    {
        if(n < 0)
            return false;
        else
            return (n & (n-1)) == 0;
    }
    public static void main(String[] args)
    {
        int n = 16;
        System.out.println("Is "+n+" is power of 2 : "+isPowerOf2(n));
    }
}
