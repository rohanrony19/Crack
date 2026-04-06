package com.rony.dsa.arrays.hmm;

public class RemoveVowel {
    public static void main(String[] args) {
        String s = "welcome to geeksforgeeks";
        String res = "";

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {
                continue;
            }else {
                res += ch;
            }
        }
        System.out.println(res);
    }
}
