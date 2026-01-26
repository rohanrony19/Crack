package com.rony.dsa.arrays.hashing;

import java.util.HashSet;
import java.util.Set;

public class TwoSumAllPairs {
    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        Set<Integer> seen = new HashSet<>();

        for(int n:arr){
            int need = target - n;

            if (seen.contains(need)){
                System.out.println(need + " + " + n + " = " + target);
            }
            seen.add(n);
        }
    }
}
