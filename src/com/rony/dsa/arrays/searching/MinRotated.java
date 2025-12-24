package com.rony.dsa.arrays.searching;

public class MinRotated {
    public static int findMin(int[] arr) {
        int l = 0, r = arr.length - 1;

        while(l < r) {
            int mid = (l + r) / 2;

            if(arr[mid] > arr[r])
                l = mid + 1;
            else
                r = mid;
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
}
