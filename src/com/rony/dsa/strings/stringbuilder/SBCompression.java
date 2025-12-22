package com.rony.dsa.strings.stringbuilder;

public class SBCompression {
    public static void main(String[] args) {
        String s = "aabbcc";
        StringBuilder sb = new StringBuilder();

        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i-1)){
                count++;
            }else {
                sb.append(s.charAt(i-1));
                if(count > 0) sb.append(count);
                count = 1;
            }
        }
        System.out.println(sb);
    }
}
