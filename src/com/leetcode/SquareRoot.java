package com.leetcode;

public class SquareRoot
{
    public static int squareRoot(int x)
    {
        int mid = 0;
        int left = 0, right = x/2 + 1;

        while(left < right)
        {
            mid = left + (right - left) / 2 + 1;
            System.out.println("left "+left+" mid "+mid+" right "+right);
            int square = mid * mid;
            if(square == x)
                return mid;
            else if(square < x)
                left = mid;
            else
                right = mid - 1 ;

        }
        return left;
    }
    public static void main(String[] args)
    {
        int x = 37;
        System.out.println(squareRoot(x));
    }
}
