package com.rony.dsa.strings.stringbuilder;

public class SBInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.insert(2,"X");

        System.out.println(sb);
    }
}
