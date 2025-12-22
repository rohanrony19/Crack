package com.rony.dsa.strings.stringbuilder;

public class SBReplace {
    public static void main(String[] args) {
        String s = "HelloWorld";
        StringBuilder sb = new StringBuilder(s);
        sb.replace(5,10,"Java");
        System.out.println(sb);
    }
}
