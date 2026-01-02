package com.rony.rohan.Collections.problems.list;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        Set<Integer> set = new LinkedHashSet<>(list); //order preserved
        List<Integer> result = new ArrayList<>(set);
        //Set ❌ → no index, no duplicates
        //List ✅ → index-based access, duplicates allowed (but now removed)
        System.out.println(result);
    }
}
