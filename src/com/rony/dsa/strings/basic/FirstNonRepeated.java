package com.rony.dsa.strings.basic;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String s = "swiss";
        int[] freq = new int[256];

        for (char c:s.toCharArray()) freq[c]++;

        for (char c:s.toCharArray()){
            if(freq[c] == 1){
                System.out.println(c);
                break;
            }
        }
    }
}
