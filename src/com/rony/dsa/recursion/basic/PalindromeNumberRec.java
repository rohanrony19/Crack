package com.rony.dsa.recursion.basic;

public class PalindromeNumberRec {
    static int rev(int n,int r){
        if(n == 0)return r;
        return rev(n/ 10, r * 10 + n % 10);
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println(rev(n,0) == n ? "Palindrome" : "Not Palindrome");
    }
}
