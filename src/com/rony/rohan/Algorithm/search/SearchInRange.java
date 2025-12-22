package com.rony.rohan.Algorithm.search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,22,19,4};
        int target = 19;
        int start = 2;
        int end = 6;
        System.out.println(linearSearch(arr,target,start,end));
    }
    public static int linearSearch(int[] arr, int target,int start,int end){
        if(arr.length==0)return -1;
        for (int index = start; index <= end; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
