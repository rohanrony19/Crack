package com.rony.dsa.arrays.kadane;

// Circular max =
// max(Kadane normal, totalSum - Kadane(invert signs))
public class CircularSubarray {
    public static void main(String[] args) {
        int[] arr = {5,-3,5};

        int total = 0;
        for(int x : arr) total += x;

        // Kadane normal
        int maxNormal = kadane(arr);

        // Kadane inverted (for circular)
        for(int i = 0; i < arr.length; i++) arr[i] = -arr[i];

        int maxCircular = total + kadane(arr);

        System.out.println(Math.max(maxNormal, maxCircular));
    }

    static int kadane(int[] arr) {
        int maxEnding = arr[0];
        int maxSoFar = arr[0];

        for(int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }
}
