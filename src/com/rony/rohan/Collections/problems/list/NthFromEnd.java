package com.rony.rohan.Collections.problems.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NthFromEnd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int n = 2;

        Integer res = nthFromEnd(list,n);
        System.out.println(res);
    }

    public static Integer nthFromEnd(List<Integer> list, int n) {

        Iterator<Integer> slow = list.iterator();
        Iterator<Integer> fast = list.iterator();

        // Move fast n steps ahead
        for (int i = 0; i < n - 1; i++) {
            if (!fast.hasNext()) return null; // n > size
            fast.next();
        }

        Integer result = null;

        // Move both together
        while (fast.hasNext()) {
            result = slow.next();
            fast.next();
        }

        return result;
    }

}
