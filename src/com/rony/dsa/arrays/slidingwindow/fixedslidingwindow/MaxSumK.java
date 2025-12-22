package com.rony.dsa.arrays.slidingwindow.fixedslidingwindow;
/*
🚀 PHASE 2 — STEP 3: SLIDING WINDOW (20 MUST-SOLVE PROBLEMS)

Sliding Window = BEST technique for:
✔ Subarrays
✔ Strings
✔ Maximum/Minimum window
✔ Frequency
✔ HashMaps
✔ Optimized O(n) solutions

Every top company asks sliding window problems.

🔥 TYPES OF SLIDING WINDOW

We will cover both:

✅ Fixed window size (simple)
✅ Variable window size (harder → most interview problems)

Let’s start.
 */
public class MaxSumK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max,sum);
        }

        System.out.println("Max sum: " + max);
    }
}
