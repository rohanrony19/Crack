package com.rony.dsa.arrays.intermediate;

import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,3,4};

        HashSet<Integer> set = new HashSet<>();

        for (int x:a)set.add(x);
        for (int y:b)set.add(y);

        System.out.println(set);
    }
}
