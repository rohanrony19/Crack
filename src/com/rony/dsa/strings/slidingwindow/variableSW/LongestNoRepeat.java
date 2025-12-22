package com.rony.dsa.strings.slidingwindow.variableSW;

import java.util.HashSet;

public class LongestNoRepeat {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int i = 0, j = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        while(j < s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println(max);
    }
}
