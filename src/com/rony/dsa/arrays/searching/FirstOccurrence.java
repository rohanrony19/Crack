package com.rony.dsa.arrays.searching;

public class FirstOccurrence {
    public static int first(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int ans = -1;

        while(l <= r) {
            int mid = (l + r) / 2;

            if(arr[mid] == target) {
                ans = mid;
                r = mid - 1;
            } else if(arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,10,10,10,18,20};
        System.out.println(first(arr, 10));
    }
}
