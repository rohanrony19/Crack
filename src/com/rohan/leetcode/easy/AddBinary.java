package com.rohan.leetcode.easy;

//Example 1:
//
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//
//Input: a = "1010", b = "1011"
//Output: "10101"

public class AddBinary {
    public static String addBinary(String a,String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String res = addBinary(a,b);
        System.out.println(res);
    }
}
