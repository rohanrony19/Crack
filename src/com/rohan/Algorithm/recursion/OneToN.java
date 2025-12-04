package com.rohan.Algorithm.recursion;

public class OneToN {
    public static void main(String[] args) {
        fun(10);
    }

    static void fun(int n){
        if(n < 1){
            return;
        }

        fun(n - 1);
        System.out.println(n);
    }
}
