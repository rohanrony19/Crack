package com.rohan.Collections.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(4);

        System.out.println("Sorted Set: " + set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Subset of (2,5) : " + set.subSet(2,5));


    }
}
