package com.rony.rohan.String.SlidingWindow;

import java.util.*;

public class SlidingWindowStrings {

    // Fixed-size window: Example → Max sum of ASCII values in substring of size k
    public static int maxAsciiSum(String s, int k) {
        int n = s.length();
        if (n < k) return -1;
        int sum = 0;
        for (int i = 0; i < k; i++) sum += (int) s.charAt(i);
        int maxSum = sum;

        for (int i = k; i < n; i++) {
            sum = sum - (int) s.charAt(i - k) + (int) s.charAt(i);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // Variable-size window: Longest substring without repeating characters
    public static int longestUniqueSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0, start = 0;

        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                // move start to right of previous occurrence
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    // Minimum window substring containing all chars of another string
    public static String minWindowSubstring(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);

        int required = tFreq.size();
        int formed = 0;
        Map<Character, Integer> windowCounts = new HashMap<>();
        int l = 0, r = 0;
        int[] ans = {-1, 0, 0}; // length, left, right

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);
            if (tFreq.containsKey(c) && windowCounts.get(c).intValue() == tFreq.get(c).intValue())
                formed++;

            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (ans[0] == -1 || r - l + 1 < ans[0]) ans = new int[]{r - l + 1, l, r};
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (tFreq.containsKey(c) && windowCounts.get(c).intValue() < tFreq.get(c).intValue())
                    formed--;
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }

    // Count substrings which are anagrams of a pattern
    public static int countAnagramSubstrings(String s, String p) {
        int[] pFreq = new int[26];
        for (char c : p.toCharArray()) pFreq[c - 'a']++;

        int count = 0, n = s.length(), k = p.length();
        int[] windowFreq = new int[26];

        for (int i = 0; i < n; i++) {
            windowFreq[s.charAt(i) - 'a']++;
            if (i >= k) windowFreq[s.charAt(i - k) - 'a']--;
            if (Arrays.equals(windowFreq, pFreq)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest unique substring length: " + longestUniqueSubstring(s));

        String str1 = "ADOBECODEBANC", t = "ABC";
        System.out.println("Minimum window substring: " + minWindowSubstring(str1, t));

        String str2 = "cbaebabacd", pattern = "abc";
        System.out.println("Count of anagram substrings: " + countAnagramSubstrings(str2, pattern));

        String str3 = "abcd", k = String.valueOf(2);
        System.out.println("Max ASCII sum substring size 2: " + maxAsciiSum(str3, 2));
    }
}
