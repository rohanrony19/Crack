package com.rony.rohan.Collections.problems.list;

import java.util.ArrayList;
import java.util.List;

public class ReverseAList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        int left = 0;
        int right = list.size()-1;

        while (left<right){
            int temp = list.get(left);
            //       index,value
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
        System.out.println(list);
    }
}
