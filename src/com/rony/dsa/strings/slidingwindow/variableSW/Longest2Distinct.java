package com.rony.dsa.strings.slidingwindow.variableSW;

import java.util.HashMap;

public class Longest2Distinct {
    public static void main(String[] args) {
        String s = "eceba";

        int k = 2;
        int i = 0, max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int j = 0; j < s.length(); j++) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            while(map.size() > k) {
                char c = s.charAt(i);
                map.put(c, map.get(c) - 1);
                if(map.get(c) == 0) map.remove(c);
                i++;
            }

            max = Math.max(max, j - i + 1);
        }
        System.out.println(max);
    }
}
