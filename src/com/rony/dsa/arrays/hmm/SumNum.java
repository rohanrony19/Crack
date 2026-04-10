package com.rony.dsa.arrays.hmm;

public class SumNum {
    public static void main(String[] args) {
        String s = "1abc23";
        int sum = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }else {
                sum += num;
                num = 0;
            }
        }
        sum += num;

        System.out.println(sum);
    }
}
