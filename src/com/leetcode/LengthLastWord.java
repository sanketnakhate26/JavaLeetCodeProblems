package com.leetcode;

public class LengthLastWord
{
    public static int lengthLastWord(String input)
    {
        if(input.isEmpty())
            return 0;
        else
        {
            int i = input.length()-1;
            int length = 0;

            input = input.trim();

            while(i >=0 && input.charAt(i) != ' ')
            {
                i--;
                length++;
            }
            return length;
        }
    }
    public static void main(String[] args)
    {
        String input = "Hello world";
        System.out.println(lengthLastWord(input));
    }
}
