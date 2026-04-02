package com.rony.dsa.arrays.hmm;

public class LargestAndSmallest {
    public static void main(String[] args) {
        String s = "This is a test string";
        String[] s1 = s.split(" ");

        String max=s1[0];
        String min=s1[0];

        for(int i=1;i<s1.length;i++){
            if(s1[i].length() > max.length()){
                max = s1[i];
            }else if(s1[i].length() < min.length()){
                min = s1[i];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
