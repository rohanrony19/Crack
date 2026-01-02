package com.rony.rohan.Collections.problems.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateListToRight {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int k = 2;

        rotateRight(list, k);
        System.out.println("Using subList: " + list);

        rotateRightInPlace(list, k);
        System.out.println("In-place: " + list);
    }

    // ✅ Approach 1: Using subList (extra space)
    public static void rotateRight(List<Integer> list, int k) {

        int n = list.size();
        if (n == 0) return;

        k = k % n;

        List<Integer> lastPart  = new ArrayList<>(list.subList(n - k, n));
        List<Integer> firstPart = new ArrayList<>(list.subList(0, n - k));

        list.clear();               // 🔥 REQUIRED
        list.addAll(lastPart);
        list.addAll(firstPart);
    }

    // ✅ Approach 2: In-place (no extra space)
    public static void rotateRightInPlace(List<Integer> list, int k) {

        int n = list.size();
        if (n == 0) return;

        k = k % n;

        reverse(list, 0, n - 1);
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
    }

    private static void reverse(List<Integer> list, int left, int right) {
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
