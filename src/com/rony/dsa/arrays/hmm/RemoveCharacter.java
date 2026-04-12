package com.rony.dsa.arrays.hmm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RemoveCharacter {
    public static void main(String[] args) {
        String s1 = "computer";
        String s2 = "cat";

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            s1 = s1.replace((c + ""),"");
        }
        System.out.println(s1);
    }
}
