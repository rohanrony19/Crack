package com.rohan.Collections.Set;

import java.util.EnumSet;
import java.util.Set;


public class EnumSetDemo {
    public static void main(String[] args) {
    Set<Day> set = EnumSet.allOf(Day.class);
//    set.add(Day.MONDAY);
//    set.add(Day.SATURDAY);
//    set.add(Day.FRIDAY);
    System.out.println(set);
    }
}

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

