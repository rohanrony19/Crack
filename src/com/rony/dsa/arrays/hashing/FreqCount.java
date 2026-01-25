package com.rony.dsa.arrays.hashing;

import java.util.HashMap;
import java.util.Map;

public class FreqCount {
    public static void main(String[] args) {
        // Input array
        int[] arr = {10, 20, 10, 30, 20, 10};

        // Step 1: Create HashMap
        // Key   -> array element
        // Value -> count of that element
        Map<Integer, Integer> freq = new HashMap<>();

        // Step 2: Traverse array
        for (int n : arr) {

            // Step 3: Read old value (DOES NOT MODIFY MAP)
            int oldCount = freq.getOrDefault(n, 0);

            // Step 4: Increase count
            int newCount = oldCount + 1;

            // Step 5: Store updated value (MODIFIES MAP)
            freq.put(n, newCount);
        }

        // Step 6: Print final frequency map
        System.out.println("Frequency count:");
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
