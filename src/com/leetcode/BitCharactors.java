package com.leetcode;

public class BitCharactors
{
    public static boolean getBitChar(int[] bits)
    {
        int i=0;
        while (i < bits.length)
        {
            i += bits[i] == 1 ? 2 : 1;

            if(i == bits.length-1) return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] bits = {1,0,1,0,0};

        System.out.println(getBitChar(bits));
    }
}
