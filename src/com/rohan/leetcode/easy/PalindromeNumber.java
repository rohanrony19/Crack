package com.rohan.leetcode.easy;

//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.

//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

//Example 3:
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

//s=O(1),t=O(log n)
public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int reversedHalf = 0;
        while(x > reversedHalf){
            reversedHalf = reversedHalf * 10 + x % 10;
            x = x/10;
        }
        return x == reversedHalf || x == reversedHalf/10;
    }

    public static void main(String[] args) {
        int x = 12321; 
        boolean res = isPalindrome(x);
        System.out.println(res);
    }
}
