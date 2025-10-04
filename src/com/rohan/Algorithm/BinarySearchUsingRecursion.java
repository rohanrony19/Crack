package com.rohan.Algorithm;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,68,74};
        int target = 1;
        System.out.println(binary(arr,target,0, arr.length-1));
    }
    static int binary(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return binary(arr,target,start,mid-1);
        }
        return binary(arr,target,mid+1,end);
    }
}
