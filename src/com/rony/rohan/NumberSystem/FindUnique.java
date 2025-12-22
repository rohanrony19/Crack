package com.rony.rohan.NumberSystem;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique = 0;

        for (int n : arr){
            unique = unique ^ n; // XOR
        }
        /*
        A   B   A ^ B
        0   0     0
        0   1     1
        1   0     1
        1   1     0

        Any number XOR with 0 we get same number
        we have 2,3,4 twice , this number ^ this number = 0
        then in last we left with 6
        ex:  unique = 0 ^ 2 = 2 => 0 ^ 10 = 10 => 2
             unique = 2 ^ 3 = 2 => 10 ^ 11 = 01 => 1
             unique = 1 ^ 3 = 2 => 01 ^ 11 = 10 => 2
             unique = 2 ^ 4 = 6 => 10 ^ 100 = 110 => 6
             unique = 6 ^ 2 = 6 => 110 ^ 10 = 100 => 4
             unique = 4 ^ 6 = 6 => 100 ^ 110 = 10 => 2
             unique = 2 ^ 4 = 6 => 10 ^ 100 = 110 => 6
         */
        return unique;
    }
}
