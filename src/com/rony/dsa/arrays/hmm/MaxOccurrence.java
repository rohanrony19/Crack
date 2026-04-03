package com.rony.dsa.arrays.hmm;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurrence {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        Map<Character,Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        char maxChar = ' ';
        int maxCount = 0;

       for (char ch:map.keySet()){
           if(map.get(ch) > maxCount){
               maxCount = map.get(ch);
               maxChar = ch;
           }
       }
        System.out.println(maxChar + " " + maxCount);
    }
}
