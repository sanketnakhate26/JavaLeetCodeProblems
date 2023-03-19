package com.practise;

public class Palindrome {
    public static void main(String[] args)
    {
        String input = "abctctba";
        int len = input.length();

        for(int i=0; i<len/2; i++)
        {
            if(input.charAt(i) != input.charAt(len-i-1))
            {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
        return;
    }

}
