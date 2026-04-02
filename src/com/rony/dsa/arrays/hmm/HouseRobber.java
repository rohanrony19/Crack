package com.rony.dsa.arrays.hmm;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 3, 8, 2, 4};

        int prev1 = 0;
        int prev2 = 0;

        for (int num:arr){
            int take = num + prev2;
            int skip = prev1;

            int curr = Math.max(take,skip);

            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
