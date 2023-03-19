package com.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void mergeSortedArrays(int[] nums1, int n , int[] nums2, int m)
    {
        int ptr1 = n-1;
        int ptr2 = m-1;
        int i = nums1.length-1;

        while(ptr1 >=0 || ptr2 >=0)
        {
            if(ptr2 < 0 || nums1[ptr1] > nums2[ptr2])
            {
                nums1[i--] = nums1[ptr1--];
            }else
            {
                nums1[i--] = nums2[ptr2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args)
    {
        int[] nums1 = {1,3,5,7,0,0,0};
        int[] nums2 = {2,4,6};

        mergeSortedArrays(nums1, 4, nums2, 3);
    }
}
