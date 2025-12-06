package com.rohan.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 17
 Google
Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = "2"
Output: ["a","b","c"]
 */

public class PhonePad {
    public static void main(String[] args) {
//        pad("","12");
//
//        System.out.println(padReturn("","12"));

        System.out.println(letterCombinations("23"));

        System.out.println(padCount("","23"));
    }

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + ",");
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' in 2
        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch,up.substring(1));
        }
    }

    public static List<String> padReturn(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' in 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padReturn(p + ch,up.substring(1)));
        }
        return list;
    }

    // leetcode
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        return helper("", digits);
    }

    private static List<String> helper(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        String letters = getLetters(ch);

        List<String> list = new ArrayList<>();
        for (char c : letters.toCharArray()) {
            list.addAll(helper(p + c, up.substring(1)));
        }
        return list;
    }

    private static String getLetters(char digit) {
        switch (digit) {
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";  // 4 letters!
            case '8': return "tuv";
            case '9': return "wxyz";  // 4 letters!
            default: return "";
        }
    }

    static int padCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' in 2
        for (int i = (digit-1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch,up.substring(1));
        }
        return count;
    }
}
