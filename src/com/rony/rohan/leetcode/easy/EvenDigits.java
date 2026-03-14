package com.rony.rohan.leetcode.easy;
/*
Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.

Example 2:
Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
 */

public class EvenDigits{
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7895};
        System.out.println(findNumbers(arr));
        System.out.println(digits(-56382222));
        System.out.println(digits2(-56382222));
    }
    static int findNumbers(int[] arr){
        int count = 0;
        for (int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether  a number contains  even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
    /*    if (numberOfDigits % 2 == 0){
            return true;
        }
        return false; */
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num>0){
            count++;
            num = num / 10;
        }
        return count;
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
