package com.rony.dsa.arrays.hmm;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "dbca";

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        s = new String(arr);

        System.out.println(s);
    }
}
