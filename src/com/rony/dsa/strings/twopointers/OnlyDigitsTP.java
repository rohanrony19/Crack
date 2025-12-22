package com.rony.dsa.strings.twopointers;

public class OnlyDigitsTP {
    public static void main(String[] args) {
        String s = "12345";

        int left = 0, right = s.length() - 1;
        boolean flag = true;

        while (left <= right){
            if(!Character.isDigit(s.charAt(left)) || !Character.isDigit(s.charAt(right))){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(flag ? "Digits" : "Not Digits");
    }
}
