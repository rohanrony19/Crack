package com.rony.rohan.Algorithm.recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,4,6,5,7};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr,int index){
        // base condition
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr,index + 1);
    }
}
