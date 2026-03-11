package com.rony.rohan.Algorithm;

//  Find the nth fibonacci number => fib(n) = fib(n-1) + fib(n-2)
//                                   fib(n-1) = fib(n-2) + fib(n-3)
// 0,1,0+1=1,1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21,.....
// 0,1,1,2,3,5,8,13,21,.....n

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int res = fibo(5);
        System.out.println(res);
    }
    static int fibo(int n){
        // Base condition = which is already known
        if(n< 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
