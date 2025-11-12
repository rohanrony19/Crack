package com.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12,55,32,94,65,72};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num:arr){
            if(num>first){
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        

        System.out.println("First Largest : " + first);
        System.out.println("Second Largest : " + second);
    }
}
