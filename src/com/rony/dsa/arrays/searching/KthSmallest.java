package com.rony.dsa.arrays.searching;

public class KthSmallest {
    public static int countLessEqual(int[] arr, int x) {
        int count = 0;
        for(int n : arr) if(n <= x) count++;
        return count;
    }

    public static int kthSmallest(int[] arr, int k) {
        int l = arr[0], r = arr[arr.length-1], ans = -1;

        while(l <= r) {
            int mid = (l + r) / 2;

            if(countLessEqual(arr, mid) >= k) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,7,10};
        System.out.println(kthSmallest(arr, 3));
    }
}
