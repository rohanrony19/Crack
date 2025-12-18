package com.practice.recursion.basic;

public class CountZerosRec {
    static int count(int n){
        if(n == 0) return 0;
        return (n % 10 == 0 ? 1 : 0) + count(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(count(105020));
    }
}
