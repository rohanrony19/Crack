package com.rony.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class PalindromeUsingStringBuilder {
    public static void main(String[] args) {
        String name = "madam";
        String rev = new StringBuilder(name).reverse().toString();
        if (name.equals(rev)){
            System.out.println(name + " is Palindrome");
        }else{
            System.out.println(name + " is not a Palindrome");
        }
    }
}
