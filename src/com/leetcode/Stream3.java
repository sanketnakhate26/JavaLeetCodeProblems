package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args)
    {
        ArrayList<String> marks = new ArrayList<>();
        marks.add("36");
        marks.add("35");
        marks.add("40");
        marks.add("30");
        marks.add("32");
        marks.add("75");

        System.out.println(marks);
        //P--> passed F--> failed P* --> passed with grace (grace is upto 3 marks to get 35 marks.)
        List<String> results = marks.stream().map(m->{
            if(Integer.valueOf(m) < 35 && Integer.valueOf(m) >= 32)
                return "35";
            else
                return m;
        }).collect(Collectors.toList());
        System.out.println(results);
        long failedCount = marks.stream().filter(i->Integer.valueOf(i)<35).count();
        System.out.println("Original Failed Students after grace : "+failedCount);
        long failedCountUpdated = results.stream().filter(i->Integer.valueOf(i)<35).count();
        System.out.println("Updated Failed Students after grace : "+failedCountUpdated);


    }
}
