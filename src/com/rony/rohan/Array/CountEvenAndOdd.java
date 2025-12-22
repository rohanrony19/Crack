package com.rony.rohan.Array;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int even = 0;
        int odd = 0;
        for (int num:arr) {
            if(num%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even "+even+" Odd "+odd);
    }
}
