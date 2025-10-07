package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class OnlyDigits {
    public static void main(String[] args) {
        String str = "12345a";
        boolean allDigit = true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                allDigit = false;
                break;
            }
        }
        System.out.println(allDigit?"Only Digits":"Contains non-Digit");
    }
}
