package com.practice.strings.basic;

public class LongestWord {
    public static void main(String[] args) {
        String s = "Java Programming Language";
        String[] words = s.split(" ");

        String longest = "";
        for(String w:words){
            if(w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest = " + longest);
    }
}
