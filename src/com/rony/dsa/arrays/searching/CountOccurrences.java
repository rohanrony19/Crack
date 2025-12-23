package com.rony.dsa.arrays.searching;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {2,4,10,10,10,18,20};

        int first = FirstOccurrence.first(arr, 10);
        int last  = LastOccurrence.last(arr, 10);

        int count = last - first + 1;

        System.out.println(count);
    }
}
