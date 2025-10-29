package com.rohan.Collections.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"Gym");
        map.put(Day.MONDAY,"walk");
        map.put(Day.SUNDAY,"Sleep");
        System.out.println(map);
        System.out.println(Day.TUESDAY.ordinal());
        map.forEach((day,task)-> System.out.println(day + " -> " + task));
    }


}

enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
