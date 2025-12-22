package com.rony.dsa.strings.basic;

public class ContainsDigit {
    public static void main(String[] args) {
        String s = "abc123";

        boolean found = false;
        for (char c:s.toCharArray()){
            if(Character.isDigit(c)){
                found = false;
                break;
            }
        }
        System.out.println(found);
    }
}
