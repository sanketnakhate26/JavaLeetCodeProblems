package com.leetcode;

import java.util.ArrayList;

public class Stream4 {
    public static void main(String[] args) {
        ArrayList<String> marks = new ArrayList<>();
        marks.add("36");
        marks.add("35");
        marks.add("40");
        marks.add("30");
        marks.add("32");
        marks.add("75");

        System.out.println(marks);

        String minMarks = marks.stream().min((i1,i2)->
        {
            return Integer.valueOf(i1.compareTo(i2));
        }).get();
        System.out.println("Min : "+minMarks);
    }
}
