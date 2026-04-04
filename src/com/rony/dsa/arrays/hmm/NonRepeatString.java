package com.rony.dsa.arrays.hmm;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        Map<Character,Integer> map = new HashMap<>();

        for (char c:s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1){
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
}
