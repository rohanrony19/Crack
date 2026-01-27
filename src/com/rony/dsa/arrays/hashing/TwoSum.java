package com.rony.dsa.arrays.hashing;

import java.util.HashMap;
import java.util.Map;

// print first pair
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15,-4};
        int target = 9;


        
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if (map.containsKey(need)){
                System.out.println("Indices: " + map.get(need) + ", " + i );
                return;
            }
            map.put(arr[i],i);
        }
    }
}
