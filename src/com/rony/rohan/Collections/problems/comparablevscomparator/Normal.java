package com.rony.rohan.Collections.problems.comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Normal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        Collections.sort(list); // Internally Comparable
    }
}
