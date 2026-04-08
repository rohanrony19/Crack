package com.rony.dsa.arrays.hmm;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; //3,4,5,1,2
        int[] arr1 = {1,2,3,4,5}; //4,5,1,2,3
        int target = 2;

        leftRotate(arr,target);
        System.out.println();
        rightRotate(arr1,target);
    }

    public static void leftRotate(int[] arr,int target){

        for (int i = 0; i < target; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }

        for (int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void rightRotate(int[] arr,int target){
        for (int i = 0; i < target; i++) {
            int last = arr[arr.length-1];
            for (int j = arr.length-1; j > 0 ; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
