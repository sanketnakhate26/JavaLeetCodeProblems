package com.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix
{
    public static String lcp(String[] input)
    {
        int len = input[0].length();
        for(int i=1; i<input.length; i++)
        {
            len = Math.min(len, input[i].length());
            for(int j=0; j<len; j++)
            {
                int c = input[0].charAt(j);
                int d = input[i].charAt(j);

                if(c!=d)
                {
                    len = j;
                    break;
                }
            }
        }
        return input[0].substring(0,len);
    }
    public static void main(String[] args)
    {
        String[] input = {"flower", "flow", "floent"};

        System.out.println("Longest common prefix of "+ Arrays.toString(input)+" is : "+lcp(input));
    }
}
