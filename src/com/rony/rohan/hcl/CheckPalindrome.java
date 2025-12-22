package com.rony.rohan.hcl;

public class CheckPalindrome {
    public static void main(String[] args) {
        String name = "madadahm";
        String rev = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            rev += name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

        boolean isPalindrome = true;
        int start = 0;
        int end = name.length() - 1;
        while (start < end){
            if(name.charAt(start) != name.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isPalindrome ? "palindrome" :"not palindrome");
    }
}
