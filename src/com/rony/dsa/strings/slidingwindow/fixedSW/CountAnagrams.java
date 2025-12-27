package com.rony.dsa.strings.slidingwindow.fixedSW;

import java.util.Arrays;

public class CountAnagrams {
    public static void main(String[] args) {
        System.out.println(countFreq("aabaabaa","aaba"));
    }

    static int countFreq(String s,String p){
        int k = p.length();

        int[] freqP = new int[26];
        int[] freqW = new int[26];

        for (char c : p.toCharArray()){
            freqP[c - 'a']++;
        }

        
        int i = 0,j = 0,count = 0;

        while (j < s.length()){
            freqW[s.charAt(j) - 'a']++;

            if(j - i + 1 < k) j++;
            else if (j - i + 1 == k) {
                if(Arrays.equals(freqP,freqW)) count++;

                freqW[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
        return count;
    }
}
