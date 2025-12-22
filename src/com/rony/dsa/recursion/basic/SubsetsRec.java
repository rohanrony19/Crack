package com.rony.dsa.recursion.basic;

public class SubsetsRec {
    static void subsets(int[] arr,int i,String curr){
        if(i == arr.length){
            System.out.println(curr);
            return;
        }

        subsets(arr,i + 1,curr + arr[i] + " "); // include
        subsets(arr,i + 1,curr); // exclude
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subsets(arr,0,"");
    }
}
