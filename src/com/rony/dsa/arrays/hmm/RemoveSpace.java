package com.rony.dsa.arrays.hmm;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "g  eeks   for ge  eeks  ";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != ' '){
                res += ch;
            }
        }
        System.out.println(res);
    }
}
