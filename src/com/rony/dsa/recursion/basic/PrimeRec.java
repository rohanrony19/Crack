package com.rony.dsa.recursion.basic;

public class PrimeRec {
    static boolean isPrime(int n,int i){
        if(i * i > n) return true;
        if(n % i == 0) return false;
        return isPrime(n , i + 1);
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(isPrime(n,2));
    }
}
