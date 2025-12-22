package com.rony.dsa.recursion.basic;

public class SumArrayRec {
    static int sum(int[] arr,int i){
        if(i == arr.length) return 0;
        return arr[i] + sum(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {5,10,15};
        System.out.println(sum(arr,0));
    }
}
