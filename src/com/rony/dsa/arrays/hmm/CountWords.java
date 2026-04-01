package com.rony.dsa.arrays.hmm;

public class CountWords {
    public static void main(String[] args) {
        String s = "abc\\\\pq\\\"";

        int count = 0;
        int length =0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) {
                length++;
            }else {
                if(length > 1){
                    count++;
                }
                length=0;
            }
        }
        if(length > 1){
            count++;
        }
        System.out.println(count);
    }
}
