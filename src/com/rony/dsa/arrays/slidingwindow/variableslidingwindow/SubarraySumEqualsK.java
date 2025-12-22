package com.rony.dsa.arrays.slidingwindow.variableslidingwindow;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0, count = 0;

        for(int n : arr) {
            prefix += n;

            if(map.containsKey(prefix - k))
                count += map.get(prefix - k);

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        System.out.println(count);
    }
}
