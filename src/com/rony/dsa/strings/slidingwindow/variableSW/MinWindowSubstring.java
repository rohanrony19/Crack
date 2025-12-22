package com.rony.dsa.strings.slidingwindow.variableSW;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;

        int count = t.length();
        int left = 0, right = 0, minLen = Integer.MAX_VALUE, start = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            if (need[r] > 0) count--;
            need[r]--;
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);
                need[l]++;
                if (need[l] > 0) count++;
                left++;
            }
        }
        System.out.println(minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen));
    }
}
