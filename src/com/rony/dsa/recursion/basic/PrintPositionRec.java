package com.rony.dsa.recursion.basic;

public class PrintPositionRec {
    static void find(int[] arr,int i,int target){
        if (i == arr.length) return;

        if(arr[i] == target) System.out.print(i + " ");

        find(arr,i + 1,target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2};
        find(arr,0,2);
    }
}
