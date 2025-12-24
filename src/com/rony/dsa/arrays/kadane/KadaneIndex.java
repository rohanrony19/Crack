package com.rony.dsa.arrays.kadane;

public class KadaneIndex {
    public static void main(String[] args) {
        int[] arr = {4,-1,2,1,-7,4,3};

        int maxEnding = 0, maxSoFar = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;

        for(int i = 0; i < arr.length; i++) {
            maxEnding += arr[i];

            if(maxEnding > maxSoFar) {
                maxSoFar = maxEnding;
                start = tempStart;
                end = i;
            }

            if(maxEnding < 0) {
                maxEnding = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Max Sum = " + maxSoFar);
        System.out.println("Range = " + start + " to " + end);
    }
}
