package com.rony.rohan.Collections.problems.list;

import java.util.*;

public class LRUCache {

    private final int capacity;
    private final List<Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new ArrayList<>();
    }

    public int get(int key) {

        if (!cache.contains(key)) {
            return -1; // not found
        }

        // Move key to most recent position
        cache.remove(Integer.valueOf(key));
        cache.add(key);

        return key;
    }

    public void put(int key) {

        if (cache.contains(key)) {
            // Already present → update position
            cache.remove(Integer.valueOf(key));
        } else if (cache.size() == capacity) {
            // Cache full → remove least recently used
            cache.remove(0);
        }

        cache.add(key); // most recent
    }

    public void display() {
        System.out.println(cache);
    }

    public static void main(String[] args) {

        LRUCache lru = new LRUCache(3);

        lru.put(1);
        lru.put(2);
        lru.put(3);
        lru.display(); // [1, 2, 3]

        lru.get(1);
        lru.display(); // [2, 3, 1]

        lru.put(4);
        lru.display(); // [3, 1, 4]
    }
}
