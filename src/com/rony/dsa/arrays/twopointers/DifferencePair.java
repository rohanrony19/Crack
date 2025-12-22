package com.rony.dsa.arrays.twopointers;

public class DifferencePair {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,12};
        int k = 7;

        int left = 0,right = 1;

        while (right<arr.length){
            int diff = arr[right] - arr[left];

            if(diff == k){
                System.out.println(arr[left] + ", " + arr[right]);
                break;
            }else if(diff < k){
                right++;
            }else {
                left++;
            }
        }
    }
}
