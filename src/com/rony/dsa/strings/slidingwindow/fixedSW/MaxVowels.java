package com.rony.dsa.strings.slidingwindow.fixedSW;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        int count = 0;
        for (int i = 0; i < k; i++) {
            if ("aeiou".contains(s.charAt(i)+"")) count++;
        }
        int max = count;

        for (int i = k; i < s.length(); i++) {
            if("aeiou".contains(s.charAt(i)+""))count++;
            if("aeiou".contains(s.charAt(i-k)+""))count--;

            max = Math.max(max,count);
        }

        System.out.println(max);
    }
}
