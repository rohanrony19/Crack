package com.rony.dsa.arrays.searching;

public class CeilingElement {
    public static int ceiling(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int ans = -1;

        while(l <= r) {
            int mid = (l + r) / 2;

            if(arr[mid] >= target) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(ceiling(arr, 6));
    }
}
