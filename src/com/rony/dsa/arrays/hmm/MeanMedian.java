package com.rony.dsa.arrays.hmm;

import java.util.Map;

public class MeanMedian {
    public static void main(String[] args) {
        int[] arr = {1, 2, 28, 5};



        int sum = 0;

        for (int num:arr){
            sum += num;
        }

        double mean = Math.floor((double) sum / arr.length);
        double median = arr[arr.length/2];

        System.out.println(mean);
        System.out.println(median);
    }
}
