package com.rohan.Collections.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Thread-safe
        // Copy-On-Write Mechanism
        // No Duplicate Elements
        // Iterators Do not reflect Modifications

        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 0; i <= 5 ; i++) {
            copy.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopOnWriteArraySet : " + copy);
        System.out.println("Initial ConcurrentSkipListSet : " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet: ");
        for (Integer num : copy){
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            // Attempting to modify the set during iteration
            copy.add(6);
        }
        System.out.println(copy);
    }
}
