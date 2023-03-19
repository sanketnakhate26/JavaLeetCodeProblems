package com.leetcode;

public class ModifiedBinary
{
    public static int modifiedBinary(int[] input, int start, int end, int target,int middle)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(input[mid] == target)
            {
                return mid;
            }
            else if(input[mid] > target)
                return modifiedBinary(input,start,mid-1,target,mid);
            else if(input[mid] < target)
                return modifiedBinary(input,mid+1,end,target,mid);
        }
        if(input[middle] < target)
        {
            while(input[middle] < target && middle < input.length-1)
                middle++;
            return middle+1;
        }
        else
        {
            while(input[middle] > target && middle > 0)
                middle--;
            return middle+1;
        }
    }
    public static void main(String[] args)
    {
        int[] input = {1,2,4,6,8,10,12,12,15};
        int target = 5;

        System.out.println("target "+target+" is found or should be at "+modifiedBinary(input,0,input.length-1,target,0));
    }
}
