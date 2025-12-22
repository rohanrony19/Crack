package com.rony.rohan.Algorithm.search;
// Time Complexity = O(log n)
// Space Complexity = O(1)
// Divide and Conquer
public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {98,76,56,44,30,12,6,4,2};
        int[] arr = {2,4,6,12,30,44,56,76,98};
        int target = 56;
        int res = orderAgnosticBS(arr,target);
        System.out.println(res);
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];
//        if (arr[start] < arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }

        // whether the array is sorted in descending order
        while (start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
