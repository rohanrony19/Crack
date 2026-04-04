package com.rony.dsa.arrays.hmm;

import java.util.HashMap;
import java.util.Map;

public class NonRepeat {
    public static void main(String[] args) {
        int[] arr = {-1,2,-1,3,2};

        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find first non-repeating
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println("First non-repeating: " + num);
                return;
            }
        }

        System.out.println("No non-repeating element");
    }
}
