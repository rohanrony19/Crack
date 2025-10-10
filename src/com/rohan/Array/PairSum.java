package com.rohan.Array;

import java.util.HashSet;
import java.util.Set;

// Time Complexity = O(n)
// Space Complexity = O(n)
// Pair with Given Sum  ->  [8, 7, 2, 5, 3, 1], target=10 → (8,2), (7,3)
public class PairSum {
    public static void main(String[] args) {
        int[] arr = {8,7,2,5,3,1};
        int target = 10;
        Set<Integer> set = new HashSet<>();
        for (int val : arr){
            if(set.contains(target - val))
                System.out.println("(" + val + "," + (target - val) + ")");
            set.add(val);
        }
    }
}
