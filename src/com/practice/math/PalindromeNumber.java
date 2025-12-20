package com.practice.math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int rev = 0;

        while (temp > 0){
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println(rev == n ? "Palindrome" : "Not Palindrome");
    }
}
