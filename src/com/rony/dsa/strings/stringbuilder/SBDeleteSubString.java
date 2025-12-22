package com.rony.dsa.strings.stringbuilder;

public class SBDeleteSubString {
    public static void main(String[] args) {
        String s = "JavaProgramming";
        StringBuilder sb = new StringBuilder(s);
        sb.delete(4,s.length());
        System.out.println(sb.toString());
    }
}
