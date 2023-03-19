package com.leetcode;

import java.util.Arrays;

public class RemoveDuplicate1
{
    public static int[] removeDuplicates(int[] input)
    {
        int start = 0, curr = 1, end = input.length-1;

        while (curr < input.length-1)
        {
            while(curr < input.length-1 && input[start] == input[curr]) curr++;
            if(curr < input.length)
            {
                input[++start] = input[curr++];
            }

        }
        return Arrays.copyOfRange(input,0,start+1);
    }
    public static void main(String[] args)
    {
        int[] input = {1,1,2,3,4,4,5,6,6,6,7,7,8,9,10,10,11};

        System.out.println(Arrays.toString(removeDuplicates(input)));
    }
}
