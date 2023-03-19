package com.practise;

public class BinarySearch
{
    public static int binarySearch(int[] nums, int start, int end, int target)
    {
        if(end >= start && end <= nums.length-1)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid] > target)
                return binarySearch(nums, start, mid-1, target);
            else
                return binarySearch(nums, mid+1, end, target);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,4,5,6,7,8};
        int target = -8;

        int result = binarySearch(nums, 0, nums.length - 1, target);
        if(result == -1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at index "+result);
    }
}