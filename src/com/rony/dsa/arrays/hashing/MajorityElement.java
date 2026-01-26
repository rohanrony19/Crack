package com.rony.dsa.arrays.hashing;

import java.util.HashMap;
import java.util.Map;

// An element is called majority element if it appears more than n/2 times.
// 2, 1, 2, 3, 3, 2, 2, 2
// MJ = n / 2 = 8 / 2 = 4
// 2 == 5, 2 > 4 -> we want greater than and not equal to 4
// 1 == 1, 1 < 4
// 3 == 2, 3 < 4
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 3, 2, 2, 2};

        Map<Integer,Integer> freq = new HashMap<>();

        // Step 1: count frequency
        for (int n :arr){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        // Step 2: check majority
        int n = arr.length;
        boolean found = false;

        for (Map.Entry<Integer,Integer> map:freq.entrySet()){
            if (map.getValue() > n/2){
                System.out.println("Majority element: " + map.getKey());
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No Majority element");
        }
    }
}
