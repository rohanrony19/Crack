package com.rony.dsa.strings.stringbuilder;

public class SBReverse {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        System.out.println(sb);
    }
}
