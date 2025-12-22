package com.rony.rohan.Algorithm.search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {24,5,19},
                {3,66,72,52},
                {44,69}
        };
        int target = 69;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr,int target){
        if(arr.length == 0)return new int[]{-1,-1};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max ){
                    max = arr[row][col];
                }
            }
        }
//        for (int[] row:arr){
//            for (int col:row){
//                if (col>max){
//                    max = col;
//                }
//            }
//        }
        return max;
    }
}
