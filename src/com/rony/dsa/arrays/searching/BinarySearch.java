package com.rony.dsa.arrays.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,20,42,69,74,86};
        int target = 69;
        System.out.println(binary(arr,target));
    }

    static int binary(int[] arr,int target){
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
