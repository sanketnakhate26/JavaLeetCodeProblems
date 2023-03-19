package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comparable
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(5);
        ar.add(20);
        ar.add(15);
//        Comparator<Integer> c = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        };
        Comparator<Integer> c = (I1,I2)->I1-I2;

        Collections.sort(ar,c);
        System.out.println(Arrays.toString(ar.toArray()));

    }

}
