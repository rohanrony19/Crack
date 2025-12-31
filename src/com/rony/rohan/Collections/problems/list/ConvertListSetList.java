package com.rony.rohan.Collections.problems.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ConvertListSetList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        Set<String> set = new LinkedHashSet<>(list);
        List<String> res = new ArrayList<>(set);
        System.out.println(res);

    }
}
