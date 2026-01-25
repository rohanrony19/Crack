package com.rony.dsa.arrays.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {4,5,4,6,5,4};

        Map<Integer,Integer> freq = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int n:arr){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        for (int n:arr){
            if(!set.contains(n)){
                System.out.println(n + "->" + freq.get(n));
                set.add(n);
            }
        }
        //or
        for(Map.Entry<Integer,Integer> map : freq.entrySet()){
            System.out.println(map.getKey() + "->" + map.getValue());
        }
    }
}
