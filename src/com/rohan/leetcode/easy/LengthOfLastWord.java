package com.rohan.leetcode.easy;

//Example 1:
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.

//Example 2:
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.

//Example 3:
//Input: s = "luffy is still joyboy"
//Output: 6
//Explanation: The last word is "joyboy" with length 6.

// t = O(n),s = O(1)

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        int Len = 0;
        int i = s.length()-1;
        while (i>=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && s.charAt(i) != ' '){
            Len++;
            i--;
        }
        return Len;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int res = lengthOfLastWord(s);
        System.out.println(res);


        
    }
}
