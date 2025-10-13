package com.rohan.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(1);
        set.add(1); // Don't store Duplicates
        set.add(87);
        System.out.println(set);
    }
}
