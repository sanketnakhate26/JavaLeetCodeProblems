package com.leetcode;

public class BinarySum
{
    public static StringBuilder addBinary(String a, String b)
    {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0; int carry = 0;

        while(i >=0 || j >=0)
        {
            int ai = i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0;
            int bi = j >= 0 ? Character.getNumericValue(b.charAt(j)): 0;

            sum = ai + bi + carry;
            if(sum == 3 || sum == 2)
                carry = 1;

            if(sum == 3 || sum == 1)
                result.append("1");
            else
                result.append("0");

            i--;
            j--;
        }
        if(carry==1)
            return result.append(carry);

        return result.reverse();

    }
    public static void main(String[] args)
    {
        String a = "111";
        String b = "10";

        System.out.println(addBinary(a,b));
    }
}
