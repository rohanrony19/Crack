package com.rony.dsa.arrays.hmm;

public class CheckSubString {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "eks";

        int count = 0;

        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            int j;
            for(j=0;j<pat.length();j++){
                if(txt.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            }
            if (j == pat.length()){
                count++;
            }
        }

        System.out.println(count);
    }
}
