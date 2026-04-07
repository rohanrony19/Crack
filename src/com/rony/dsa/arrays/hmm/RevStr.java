package com.rony.dsa.arrays.hmm;

public class RevStr {
    public static void main(String[] args) {
        String s = "rohan";
        String rev = "";

        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            rev += ch;
        }
        System.out.println(rev);
    }
}
