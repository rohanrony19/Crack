package com.rohan.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Using Implementation class
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length(); // shorter to longer length
    }
}

// ok = s1 < s1 - s2
// bye = s2 < s2 - s1
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1; // returns negative for ascending
    }

}
// 5 3 = 2 < o2-o1
// 3 5 = -2 < o1-o2
public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(1);

        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("banana","apple","date");
        words.sort(new StringLengthComparator());
        System.out.println(words);

        // Using Lambda Expression
        List<String> name = Arrays.asList("soniaShri","rohan","sunnyleo","mia");
        name.sort(null);
        System.out.println(name);

        name.sort((n,m)->n.length()-m.length()); //ascending
        System.out.println(name);

        name.sort((a,b)->b.length()-a.length());  //descending
        System.out.println(name);
    }
}
