package com.leetcode;

public class InsertPositionSortedArray
{
    public static int getInsertPosition(int[] input, int start, int end, int target)
    {
        int mid=0;
        while(start <= end)
        {
            mid = start + (end - start)/2;
            if(input[mid] == target)
                return mid;
            else if(input[mid] > target)
                end= mid-1;
            else
                start= mid+1;
        }
        if(mid == input.length-1)
            return mid+1;
        else
            return mid;
    }
    public static void main(String[] args)
    {
        int input[] = {1,2,3,5,5,6,7,8,9};
        int target = 4;

        System.out.println(getInsertPosition(input,0, input.length-1, target));
    }
}
