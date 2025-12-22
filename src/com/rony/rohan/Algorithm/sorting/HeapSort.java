package com.rony.rohan.Algorithm.sorting;
//Heap Sort = O(n log n) time, O(1) space. Always.
public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build a max heap
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    private static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;           // root
        int left = 2 * i + 1;      // left child
        int right = 2 * i + 2;     // right child

        // If left child is larger than root
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, heapSize, largest);
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 1};

        heapSort(arr);

        System.out.println("Sorted:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
