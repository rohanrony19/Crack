package com.rony.rohan.Collections.problems.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,1,2,0,4);

        for (Integer x:list){
            if (Collections.frequency(list,x) == 1){
                System.out.println("First non repeating : " + x);
                break;
            }
        }
    }
}
