package com.practise;


import java.util.ArrayList;
import java.util.stream.*;

public class Stream5 {
    public static void main(String[] args) {
        ArrayList<String> marks = new ArrayList<>();
        marks.add("36");
        marks.add("35");
        marks.add("40");
        marks.add("30");
        marks.add("32");
        marks.add("75");

        System.out.println(marks);

        Integer[] ar = marks.stream().map(i->Integer.valueOf(i)).toArray(Integer[]::new);
        Integer ele = Stream.of(ar).findFirst().get();
        System.out.println(ele);
    }
}
