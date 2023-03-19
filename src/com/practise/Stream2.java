package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(11);
        marks.add(12);
        marks.add(13);
        marks.add(14);
        marks.add(15);

        System.out.println(marks);
        //add 5 grace marks
        List<Integer> marks2 = marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(marks2);

    }
}
