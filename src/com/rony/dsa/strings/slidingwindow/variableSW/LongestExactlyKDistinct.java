package com.rony.dsa.strings.slidingwindow.variableSW;

import java.util.HashMap;

public class LongestExactlyKDistinct {
    public static void main(String[] args) {
        String s = "aabbcc";
        int k = 2;

        int i = 0, j = 0, max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while(j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            if(map.size() == k)
                max = Math.max(max, j - i + 1);

            while(map.size() > k) {
                char ch = s.charAt(i);
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0) map.remove(ch);
                i++;
            }
            j++;
        }

        System.out.println(max);
    }
}
