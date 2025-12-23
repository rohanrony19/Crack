package com.rony.dsa.arrays.searching;

public class FloorElement {
    public static int floor(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int ans = -1;

        while(l <= r) {
            int mid = (l + r) / 2;

            if(arr[mid] <= target) {
                ans = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(floor(arr, 6));
    }
}
