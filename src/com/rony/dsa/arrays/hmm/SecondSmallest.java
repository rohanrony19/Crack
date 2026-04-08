package com.rony.dsa.arrays.hmm;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 25, 8, 55, 10, 33, 17, 11};

        secondSmallest(arr);
    }

    public static void secondSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num:arr) {
            if(num<min){
                secondMin=min;
                min=num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        System.out.println("min: " + min + " ,second min: " + secondMin);
    }
}
