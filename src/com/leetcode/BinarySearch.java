package com.leetcode;

public class BinarySearch
{
    public static int binarySearch(int[] n, int start, int end, int target)
    {
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (n[mid] == target)
                return mid;
            else if (n[mid] > target)
                return binarySearch(n, start, mid - 1, target);
            else
                return binarySearch(n, mid + 1, end, target);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] n = {1,1,2,3,4,4,4,5,6,6,7,8,9,9,10};
        int target = 13;
        int result = binarySearch(n,0,n.length-1,target);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("target found at "+result);
    }
}
