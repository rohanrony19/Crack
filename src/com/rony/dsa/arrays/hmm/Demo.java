package com.rony.dsa.arrays.hmm;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] a = {-3,-2,-1,0,1,2,10}; //= 0,1,4,9,100   9,4,1,0

        for(int i = 0;i<a.length;i++){
            a[i] = a[i]*a[i];
        }

        int start = 0,end = a.length-2;
        while(start<end){
            if(a[start] > a[end]){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                while(a[i] > a[j]){
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(a));
    }
}
