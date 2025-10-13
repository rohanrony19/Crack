package com.rohan.Collections.Set;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 0; i <= 5 ; i++) {
            concurrentSkipListSet.add(i);
        }
        System.out.println("Initial ConcurrentSkipListSet : " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet: ");
        for (Integer num : concurrentSkipListSet){
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            // Attempting to modify the set during iteration
            concurrentSkipListSet.add(6);
        }

    }
}
