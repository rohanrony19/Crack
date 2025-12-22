package com.rony.dsa.recursion.basic;

public class PrintArrayRec {
    static void print(int[] arr,int i){
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30};
        print(arr,0);
    }
}
