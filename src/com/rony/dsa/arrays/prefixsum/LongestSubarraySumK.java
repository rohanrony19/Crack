package com.rony.dsa.arrays.prefixsum;

import java.util.*;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0, maxLen = 0;

        for(int i = 0; i < arr.length; i++) {
            prefix += arr[i];

            if(prefix == k)
                maxLen = i + 1;

            if(!map.containsKey(prefix))
                map.put(prefix, i);

            if(map.containsKey(prefix - k))
                maxLen = Math.max(maxLen, i - map.get(prefix - k));
        }

        System.out.println(maxLen);
    }
}
