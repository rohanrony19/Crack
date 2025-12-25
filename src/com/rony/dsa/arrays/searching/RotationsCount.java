package com.rony.dsa.arrays.searching;

public class RotationsCount {
    public static int rotationCount(int[] arr) {
        int l = 0, r = arr.length - 1;

        while(l < r) {
            int mid = (l + r) / 2;

            if(arr[mid] > arr[r]) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        System.out.println(rotationCount(arr));
    }
}
