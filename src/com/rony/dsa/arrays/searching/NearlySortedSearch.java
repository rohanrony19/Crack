package com.rony.dsa.arrays.searching;

public class NearlySortedSearch {
    public static int search(int[] arr, int target) {
        int l = 0, r = arr.length - 1;

        while(l <= r) {
            int mid = (l + r) / 2;

            if(arr[mid] == target) return mid;
            if(mid - 1 >= l && arr[mid - 1] == target) return mid - 1;
            if(mid + 1 <= r && arr[mid + 1] == target) return mid + 1;

            if(target < arr[mid]) r = mid - 2;
            else l = mid + 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,3,40,20,50,80,70};
        System.out.println(search(arr, 40));
    }
}
