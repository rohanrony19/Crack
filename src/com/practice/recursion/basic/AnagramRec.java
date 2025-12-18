package com.practice.recursion.basic;

import java.util.Arrays;

public class AnagramRec {
    static boolean check(char[] a,char[] b,int i){
        if(i == a.length) return true;
        if(a[i] != b[i]) return false;
        return check(a,b,i+1);
    }

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(check(a,b,0));
    }
}
