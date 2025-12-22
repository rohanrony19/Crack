package com.rony.rohan.hcl;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurrenceUsingHashMap {
    public static void main(String[] args) {
        String input = "frequency of characters";
        HashMap<Character,Integer> charCountMap = new HashMap<>();
        input = input.toLowerCase();
        for (char c : input.toCharArray()){
            if (c != ' '){
                charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
            }
        }
        System.out.println("character frequency:");
        for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            System.out.println(entry.getKey()+": " +entry.getValue());
        }
    }
}
