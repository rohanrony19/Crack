package com.rony.dsa.strings.stringbuilder;

public class SBRemoveDuplicates {
    public static void main(String[] args) {
        String s = "banana";

        StringBuilder sb = new StringBuilder();

        for (char c:s.toCharArray()){
            if(sb.indexOf(c+"") == -1){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
