package com.rony.dsa.arrays.hmm;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class RemoveUnwanted {
    public static void main(String[] args) {
        String s = "$Gee*k;s..fo, r'Ge^eks?";

//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z'){
//                s = s.substring(0,i) + s.substring(i+1);
//                i--;
//            }
//        }
//        System.out.println(s);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
