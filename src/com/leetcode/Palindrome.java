package com.leetcode;

public class Palindrome
{
    public static boolean isPalindromeString(int input)
    {
        String inputString = String.valueOf(input);
        String reverseString = "";

        for(int i=inputString.length()-1; i>=0; i--)
        {
            reverseString = reverseString + inputString.charAt(i);
        }

        if(reverseString.equals(inputString))
            return true;
        else
            return false;
    }
    public static boolean isPalindromeWithoutString(int input)
    {
        int copy = input;
        int reverse = 0;

        while(copy > 0)
        {
            int digit = copy%10;
            reverse = reverse*10 + digit;
            copy = copy/10;
        }
        if(input == reverse)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        int input = 123219;
        //Method1 by converting to String
        System.out.println("isPalindrome "+input+" (Method1): "+isPalindromeString(input));
        //Method2 without converting to String
        System.out.println("isPalindrome "+input+" (Method2): "+isPalindromeWithoutString(input));

    }
}
