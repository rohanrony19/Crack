package com.rony.dsa.strings.twopointers;

public class PalindromeStringTP {
    public static void main(String[] args) {
        String s = "madam";
        int left=0,right=s.length()-1;

        boolean flag = true;

        while (left<right){
            if(s.charAt(left) != s.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(flag ? "Palindrome":"Not Palindrome");
    }
}
