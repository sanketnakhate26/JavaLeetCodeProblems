package com.practise;

import java.util.Arrays;

public class BubbleSort
{
    public static void bubbleSort(int[] nums)
    {
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j< nums.length; j++)
            {
                if(nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("sorted array"+ Arrays.toString(nums));
    }
    public static void main(String[] args)
    {
        int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};

        bubbleSort(nums);
    }

}
