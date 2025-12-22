package com.rony.rohan.leetcode.easy;
// 1672
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {42,44,30},
                {55,54,21},
                {69,12,32}
        };
        // max = 55,54,21 => 55+54+21 = 130
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
