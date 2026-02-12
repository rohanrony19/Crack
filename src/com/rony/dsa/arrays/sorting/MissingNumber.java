package com.rony.dsa.arrays.sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 3, 5};

        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        // Now check missing numbers
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                System.out.println("Missing: " + (index + 1));
            }
        }
    }
}
