package com.rony.dsa.strings.stringbuilder;

public class SBSwapCharacters {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("noox");
        char first = sb.charAt(0);
        char last = sb.charAt(sb.length()-1);

        sb.setCharAt(0,last);
        sb.setCharAt(sb.length()-1,first);

        System.out.println(sb);
    }
}
