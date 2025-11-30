package com.rohan.leetcode.medium;
/*
Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1
 */
public class Mountain {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }else {
                // you are in asc part of array
                start = mid + 1; // bcz we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest no bcz  of 2 checks above
        // start and end always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one bcz of what the checks says
        return start; // or return end as both are =
    }
}
