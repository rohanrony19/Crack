package com.rony.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class PalindromeWithoutSB {
    public static void main(String[] args) {
        String name = "madam";
        boolean isPalindrome = true;

        int i = 0;
        int j = name.length() - 1;
        while (i < j){
            if (name.charAt(i)!=name.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(name + (isPalindrome ? " is Palindrome" : " is not a Palindrome"));
    }
}
