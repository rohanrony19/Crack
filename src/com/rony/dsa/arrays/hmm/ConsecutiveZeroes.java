package com.rony.dsa.arrays.hmm;

public class ConsecutiveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1,1,1};

        if(arr.length == 0){
            return;
        }

        int maxCount = 0,count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                maxCount = Math.max(maxCount,count);
                count = 1;
            }
        }
        System.out.println(Math.max(maxCount,count));
    }
}
