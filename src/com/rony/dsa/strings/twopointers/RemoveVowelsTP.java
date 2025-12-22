package com.rony.dsa.strings.twopointers;

public class RemoveVowelsTP {
    public static void main(String[] args) {
        String s = "beautiful";
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while (i < sb.length()){
            if("aeiouAEIOU".contains(sb.charAt(i) + "")){
                sb.deleteCharAt(i);
            }else {
                i++;
            }
        }
        System.out.println(sb.toString());
    }
}
