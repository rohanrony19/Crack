package com.rony.dsa.arrays.sorting;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,6,2};

        for (int n:arr){
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(arr,0,arr.length-1);

        System.out.println("After sorting");
        for (int n:arr){
            System.out.println(n + " ");
        }
        
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l<r){

            int mid = l + (r - l) / 2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int x=0;x<n1;x++){
            lArr[x] = arr[l+x];
        }
    }
}
