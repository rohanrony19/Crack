package com.rony.rohan.Collections.problems.list;

import java.util.ArrayList;
import java.util.List;

public class Level2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        System.out.println(list);

        System.out.println("-------------------");

        list.add(2,6); // add at index
        System.out.println(list);

        // index, value
        list.set(1,4); // replace
        list.set(3,2);
        System.out.println(list);
    }
}
