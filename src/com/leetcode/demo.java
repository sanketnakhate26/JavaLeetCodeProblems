package com.leetcode;

public class demo {
    public static void main(String[] args)
    {
        String input = "nokia-state:/state/chassis/power-supply/hardware-data";
        String lParentXpath=input.substring(0, input.lastIndexOf('/'));
        String output= lParentXpath.substring(lParentXpath.indexOf('/',2));
        System.out.println(output);
    }
}
