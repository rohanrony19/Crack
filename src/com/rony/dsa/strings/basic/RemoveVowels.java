package com.rony.dsa.strings.basic;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "beautiful day";
        String res = "";

        for (char c:s.toCharArray()){
            if (!"aeiouAEIOU".contains(c + "")) res += c;
        }
        System.out.println(res);
    }
}
