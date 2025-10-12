package com.rohan.Collections.List;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1); // Double capacity
        System.out.println(vector.capacity());

        Vector<Integer> vector1 = new Vector<>(Arrays.asList(2,3,4));
        vector1.add(5);
        System.out.println(vector1);
    }
}
