package com.rony.dsa.arrays.searching;

public class SqrtBinary {
    public static int sqrt(int n) {
        int l = 1, r = n, ans = 0;

        while(l <= r) {
            int mid = (l + r) / 2;

            if(mid <= n / mid) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
}
