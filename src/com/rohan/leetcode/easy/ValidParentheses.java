package com.rohan.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

//Example 2:
//Input: s = "()[]{}"
//Output: true

//Example 4:
//Input: s = "([])"
//Output: true

//Example 5:
//Input: s = "([)]"
//Output: false

//s=O(n),t=O(n)
public class ValidParentheses {
    public static boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            switch (c){
                case '(':stack.push(')');break;
                case '{':stack.push('}');break;
                case '[':stack.push(']');break;
                default:
                    if(stack.isEmpty() || stack.pop() != c){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([)]";
        boolean res = isValid(s);
        System.out.println(res);
    }
}
