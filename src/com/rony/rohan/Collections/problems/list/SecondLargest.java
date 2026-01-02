package com.rony.rohan.Collections.problems.list;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,5,20,8);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num:list){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}
