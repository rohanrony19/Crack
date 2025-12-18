package com.practice.arrays.intermediate;

import java.util.HashSet;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,3,4};

        HashSet<Integer> set = new HashSet<>();

        for (int x:a)set.add(x);
        System.out.print("Intersection: ");

        for (int y:b){
            if(set.contains(y)) {
                System.out.print(y + " ");
            }
        }
    }
}
