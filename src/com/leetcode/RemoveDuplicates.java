package com.leetcode;

public class RemoveDuplicates
{
    public static int removeDuplicate(int[] n)
    {
        int i=0;
        for(int j=0; j<n.length; j++)
        {
            n[i++] = n[j];
            while(j < n.length-1 && n[j] == n[j+1])
            {
                j++;
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        int[] n = {1,1,2,3,4,4,4,5,6,6,7,8,9,9,10};

        int len = removeDuplicate(n);
        for(int i=0;i<len;i++)
            System.out.print(n[i]+" ");
    }
}
