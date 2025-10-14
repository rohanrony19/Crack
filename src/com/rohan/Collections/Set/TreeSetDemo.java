package com.rohan.Collections.Set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

// Sorted
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(1);
        set.add(8);
        set.add(6);
        System.out.println(set);
        System.out.println(set.ceiling(4));
        System.out.println(set.contains(8));
        for (int i : set){
            System.out.println(i);
        }

        Set<Integer> set1 = new ConcurrentSkipListSet<>();

    }
}
