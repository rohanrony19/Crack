package com.rony.rohan.Collections.problems.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindMiddleElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Integer middle = findMiddle(list);
        System.out.println("Middle Element: " + middle);
    }

    static Integer findMiddle(List<Integer> list){

        Iterator<Integer> slow = list.iterator();
        Iterator<Integer> fast = list.iterator();

        Integer mid = null;

        while (fast.hasNext()){
            mid = slow.next(); // move slow once
            fast.next(); // move fast once
            if (fast.hasNext()){
                fast.next(); // move fast twice
            }
        }
        return mid;
    }
}
