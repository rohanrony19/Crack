package com.rony.rohan.leetcode.hard;
/*
Example 1:
Input: mountainArr = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:
Input: mountainArr = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 */

public class SearchInMountain {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(mountainArr, target));  // Fixed param
    }

    public static int findInMountainArray(int[] arr, int target) {  // Fixed param type
        int peak = peakIndexInMountainArray(arr);  // Fixed param
        int firstTry = orderAgnosticBS(arr, target, 0, peak);  // Fixed param
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);  // Fixed length
    }

    static int peakIndexInMountainArray(int[] arr) {  // Fixed param type
        int start = 0;
        int end = arr.length - 1;  // Fixed length

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {  // Fixed array access
                // you are in dec part of array
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1;
            }
        }
        return start; // peak index
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {  // Fixed param
        boolean isAsc = arr[start] < arr[end];  // Fixed array access

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {  // Fixed array access
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {  // Fixed array access
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {  // Fixed array access
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
