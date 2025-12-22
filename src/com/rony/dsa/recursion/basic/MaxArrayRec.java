package com.rony.dsa.recursion.basic;

public class MaxArrayRec {
    static int max(int[] arr,int i){
        if(i == arr.length - 1)return arr[i];
        return Math.max(arr[i],max(arr,i + 1));
    }

    public static void main(String[] args) {
        int[] arr = {10,50,30,20};
        System.out.println(max(arr,0));
    }
}
