package com.rony.dsa.arrays.hmm;

import java.util.HashMap;
import java.util.Map;

public class StringFreq {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> m:map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
