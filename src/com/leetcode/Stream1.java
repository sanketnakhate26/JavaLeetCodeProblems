package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(11);
        ar.add(12);
        ar.add(13);
        ar.add(14);
        ar.add(15);

        System.out.println(ar);
        //print only even numbers
        List<Integer> ar2 = ar.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(ar2);

    }
}
