package com.rony.dsa.arrays.hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSumAllIndices {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if (map.containsKey(need)){
                System.out.println(
                        "Indices: " + map.get(need) + ", " + i
                );
            }
            map.put(arr[i],i);
        }
    }
}
