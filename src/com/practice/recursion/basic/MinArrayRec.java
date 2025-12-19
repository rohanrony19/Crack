package com.practice.recursion.basic;

public class MinArrayRec {
    static int min(int[] arr,int i){
        if(i < arr.length - 1) return arr[i];
        return Math.min(arr[i],min(arr,i+1));
    }

    public static void main(String[] args) {
        int[] arr = {10,50,30,20};
        System.out.println(min(arr,0));
    }
}
