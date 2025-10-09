package com.rohan.String;

public class CountAndSay {
    public static String countAndSay(int n){
        if(n == 1)return "1";
        String s = countAndSay(n-1);
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i-1))count++;
            else {
                res.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
