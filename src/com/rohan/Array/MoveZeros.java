package com.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int index = 0;
        for (int num : arr){
            if(num != 0){
                arr[index++] = num;
            }
        }
        while (index < arr.length) arr[index++] = 0;
        for (int x : arr) System.out.print(x + " ");
    }
}
