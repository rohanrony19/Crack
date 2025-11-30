package com.rohan.Algorithm.search;

// smallest number which is >= target
// target is 55 then 55 >= 44 (near and less than 55)
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,4,6,12,30,44,56,76,98};
        int target = 555;
        int res = ceiling(arr,target);
        System.out.println(res);
    }

    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        // but what is the target is greater than the all numbers ex: 165
        if(target > arr[arr.length-1]){
            return -1;
        }

        // whether the array is sorted in descending order
        while (start<=end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
        return start; // this is the only change in binary search
    }
}
