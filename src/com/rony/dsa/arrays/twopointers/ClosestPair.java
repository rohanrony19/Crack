package com.rony.dsa.arrays.twopointers;

public class ClosestPair {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,10};
        int target = 15;

        int left = 9 ,right = arr.length - 1;
        int bestL = 0, bestR = arr.length-1;
        int bestDiff = Integer.MAX_VALUE;

        while (left < right){
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);

            if(diff < bestDiff){
                bestDiff = diff;
                bestL = left;
                bestR = right;
            }

            if(sum < target) left++;
            else right--;
        }
        System.out.println(arr[bestL] + ", " + arr[bestR]);
    }
}
