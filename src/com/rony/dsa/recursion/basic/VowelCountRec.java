package com.rony.dsa.recursion.basic;

public class VowelCountRec {
    static int count(String s,int i){
        if (i == s.length()) return 0;

        char c = s.charAt(i);
        int add = "aeiouAEIOU".contains(c + "") ? 1 : 0;

        return add + count(s,i + 1);
    }

    public static void main(String[] args) {
        System.out.println(count("beautiful",0));
    }
}
