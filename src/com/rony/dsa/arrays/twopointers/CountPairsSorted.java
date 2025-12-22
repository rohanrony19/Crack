package com.rony.dsa.arrays.twopointers;

public class CountPairsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;
        int left = 0,right = arr.length-1;
        int count = 0;

        while (left<right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                count++;
                left++;
            } else if (sum < target) {
                left++;
            }else {
                right--;
            }
        }
        System.out.println("Pairs: " + count);
    }
}
