package com.rony.rohan.Algorithm.recursion;
// t,s = O(n)
public class Nto1 {
    public static void main(String[] args) {
//        fun(10);
//        funRev(5);
        concept(5);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n){
        if(n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

    static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        concept(n--);
        concept(--n);

//        n-- vs --n
//        pass and next minus vs minus and next pass
    }
}
