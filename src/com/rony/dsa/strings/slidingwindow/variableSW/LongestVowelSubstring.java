package com.rony.dsa.strings.slidingwindow.variableSW;

public class LongestVowelSubstring {
    public static void main(String[] args) {
        String s = "earthproblemioaauu";

        int i = 0, max = 0;

        for(int j = 0; j < s.length(); j++) {
            if(!"aeiou".contains(s.charAt(j) + "")) i = j + 1;
            max = Math.max(max, j - i + 1);
        }

        System.out.println(max);
    }
}
