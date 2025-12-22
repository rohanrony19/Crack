package com.rony.dsa.strings.basic;

public class StringRotation {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "cdeab";

        System.out.println((a+a).contains(b));
    }
}
