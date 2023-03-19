package com.leetcode;

public class CountAndSay
{
    public static StringBuilder countAndSay(String str)
    {
        StringBuilder result = new StringBuilder();

        int count=1;
        char lastch = str.charAt(0);
        int counter = 1;
        while(counter < str.length())
        {
            char ch = str.charAt(counter);
            if(lastch == ch)
                count++;
            else{
                result = result.append(String.valueOf(count)).append(lastch);
                count = 1;
                lastch = ch;
            }
            counter++;
        }
        result = result.append(String.valueOf(count)).append(lastch);
        return result;
    }
    public static void main(String[] args)
    {
        String str = "3322251";
        System.out.println(countAndSay(str));
    }
}
