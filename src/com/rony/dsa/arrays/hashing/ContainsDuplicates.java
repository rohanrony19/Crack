package com.rony.dsa.arrays.hashing;

import java.util.HashSet;

import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};

        Set<Integer> set = new HashSet<>();

        for (int n:arr){
            if(set.contains(n)){
                System.out.println(true);
                return;
            }
            set.add(n);
        }
        System.out.println(false);
    }
}
