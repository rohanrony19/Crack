package com.rohan.Algorithm.search;

// greatest number which is <= target
// target is 55 then 55 <= 56 (near and greater than 55)
public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,4,6,12,30,44,56,76,98};
        int target = 55;
        int res = floorBS(arr,target);
        System.out.println(res);
    }

    static int floorBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
        return end; // this is the only change
    }
}
