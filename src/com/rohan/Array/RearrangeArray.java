package com.rohan.Array;
//Input: [1, 2, -3, -1, -2, 3]
//Output: [1, -3, 2, -1, 3, -2]
public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,3};
        int[] res = new int[arr.length];
        int pos = 0,neg = 1;

        for (int val : arr){
            if(val >= 0 && pos < arr.length){
                res[pos] = val;
                pos = pos + 2;
            } else if (val <0  && neg < arr.length) {
                res[neg] = val;
                neg = neg + 2;
            }
        }
        for (int x:res) System.out.print(x + " ");
    }
}
