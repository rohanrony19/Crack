package com.rony.dsa.strings.sorting;

import java.util.Arrays;

public class SortStringChars {
    public static void main(String[] args) {
        String s = "dacbe";
        char[] ch = s.toCharArray();  //[d,a,c,b,e]
        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
}
