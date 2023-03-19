package com.practise;

public class ReverseNo
{
    public static boolean isPalindrome(int input)
    {
        int copy = input;
        int reverse = 0;

        if(copy < 0)
            return false;
        else
        {
            while (copy > 0) {
                int digit = copy % 10;
                reverse = reverse * 10 + digit;
                copy = copy / 10;
            }
        }
        return input == reverse;
    }
    public static void main(String[] args)
    {
        int input = 121;
        System.out.println("isPalindrome "+input+" : "+isPalindrome(input));
    }
}
