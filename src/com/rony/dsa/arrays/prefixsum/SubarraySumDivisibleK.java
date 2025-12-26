package com.rony.dsa.arrays.prefixsum;

import java.util.*;

public class SubarraySumDivisibleK {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0, count = 0;

        for(int x : arr) {
            prefix += x;

            int mod = prefix % k;
            if(mod < 0) mod += k;

            if(map.containsKey(mod))
                count += map.get(mod);

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        System.out.println(count);
    }
}
