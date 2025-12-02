package com.rohan.NumberSystem;

public class Palindrome {
    public static void main(String[] args) {
        String name = "madam";
        boolean isPalindrome = true;
        int start = 0;
        int end = name.length()-1;
        while (start < end){
            if(name.charAt(start) != name.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(name + (isPalindrome?" is Palindrome" : " is not a Palindrome"));
    }
}
