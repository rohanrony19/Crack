package com.rony.dsa.arrays.twopointers;

public class TwoSumSorted {
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,9};
        int target = 11;

        int left=0,right=arr.length-1;

        while (left<right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println("Indices: " + left + ", " + right);
                break;
            }else if (sum > target){
                right--;
            }else {
                left++;
            }
        }
    }
}
