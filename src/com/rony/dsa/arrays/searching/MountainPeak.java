package com.rony.dsa.arrays.searching;

public class MountainPeak {
    public static int peakIndex(int[] arr) {
        int l = 0, r = arr.length - 1;

        while(l < r) {
            int mid = (l + r) / 2;

            if(arr[mid] < arr[mid + 1])
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,8,12,4,2};
        System.out.println(peakIndex(arr));
    }
}
