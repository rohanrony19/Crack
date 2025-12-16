package com.practice.basic;

public class CountDigits {
    public static void main(String[] args) {
        int num = 56789;
        int count = 0;

        while (num > 0){
            count++;
            num = num/10;
        }

        System.out.println(count);
    }
}
