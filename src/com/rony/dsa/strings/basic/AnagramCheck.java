package com.rony.dsa.strings.basic;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String a = "silent";
        String b = "listen";
        
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(Arrays.equals(x,y));
    }
}
