package com.rony.dsa.arrays.intermediate;

import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;
        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i+k) % n] = arr[i];
            /*
            i=0, r[(0+2)%5] = r[2],a[i] = a[0],  r[2] = a[0]
            i=1, r[(1+2)%5] = r[3],a[i] = a[1],  r[3] = a[1]
            i=2, r[(2+2)%5] = r[4],a[i] = a[2],  r[4] = a[2]
            i=3, r[(3+2)%5] = r[0],a[i] = a[3],  r[0] = a[3]
            i=4, r[(4+2)%5] = r[1],a[i] = a[4],  r[1] = a[4]
             */
        }




        

        for (int i = 0; i < n; i++) {
            arr[i] = rotated[i];
        }

        System.out.println(Arrays.toString(arr)); // 4,5,1,2,3
    }
}
