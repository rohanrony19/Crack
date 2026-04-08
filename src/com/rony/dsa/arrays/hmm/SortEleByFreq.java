package com.rony.dsa.arrays.hmm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortEleByFreq {
    public static void main(String[] args) {
        int[] arr = {5,5,4,6,4};

        Map<Integer,Integer> map = new HashMap<>();

        // Step 1: count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: convert to Integer[] for sorting
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Step 3: sort using comparator
        Arrays.sort(temp, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a); // freq descending
            } else {
                return a - b; // value ascending
            }
        });

        // Print result
        System.out.println(Arrays.toString(temp));
    }
}
