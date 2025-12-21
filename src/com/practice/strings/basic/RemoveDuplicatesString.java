package com.practice.strings.basic;

public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String s = "banana";
        String res = "";

        for (char ch:s.toCharArray()){
            if(res.indexOf(ch) == -1){
                res += ch;
            }
        }
        System.out.println(res);
    }
}
