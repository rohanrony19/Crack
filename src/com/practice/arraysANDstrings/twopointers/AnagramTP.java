package com.practice.arraysANDstrings.twopointers;

import java.util.Arrays;

public class AnagramTP {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);

        int i = 0;
        boolean flag = true;

        while (i < x.length){
            if(x[i] != y[i]){
                flag = false;
                break;
            }
            i++;
        }
        System.out.println(flag ? "Anagram" : "Not Anagram");
    }
}
