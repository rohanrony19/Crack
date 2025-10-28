package com.rohan.Collections.Set;

import java.util.LinkedHashSet;
// Maintains insertion order

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Cherry");
        set.add("Apple");
        set.add("Mango");
        set.add("Grape");
        set.add("Melons");
        System.out.println(set);
    }
}
