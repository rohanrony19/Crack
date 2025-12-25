package com.rony.dsa.arrays.searching;

public class SearchBitonic {
    public static int search(int[] arr, int target) {
        int peak = MountainPeak.peakIndex(arr);

        int res1 = binaryAsc(arr, 0, peak, target);
        if(res1 != -1) return res1;

        return binaryDesc(arr, peak + 1, arr.length - 1, target);
    }

    static int binaryAsc(int[] arr, int l, int r, int target) {
        while(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    static int binaryDesc(int[] arr, int l, int r, int target) {
        while(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,8,12,4,2};
        System.out.println(search(arr, 4));
    }
}
