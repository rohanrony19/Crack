package com.rony.dsa.arrays.hmm;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseg";

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for(int count:freq){
            if(count!=0){
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
