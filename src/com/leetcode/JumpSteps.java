package com.leetcode;

public class JumpSteps {
    public static int findJumps(int[] input, int start, int length)
    {
        //base case
        if(start == length)
            return 0;
        // loop
        if(input[start] == 0)
            return Integer.MAX_VALUE;

        // recursion
        int min = Integer.MAX_VALUE;
        for(int i = start + 1; i <= length && i <= start + input[start]; i++ )
        {
            int tempMin = findJumps(input,i,length);
            if(tempMin != Integer.MAX_VALUE && tempMin + 1 < min)
                min = tempMin + 1;
        }
        return min;
    }
    public static void main(String[] args)
    {
//        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int arr[] = { 1, 1, 1, 1, 3, 2, 6, 5, 6, 8, 9 };
        int len = arr.length;

        System.out.println(findJumps(arr, 0, len-1));
    }
}
