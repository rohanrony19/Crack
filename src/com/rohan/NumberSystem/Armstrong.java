package com.rohan.NumberSystem;
//1^3+5^3+3^3 = 153
// Time Complexity = O(log10n)==O(d)
// Space Complexity = O(n)
public class Armstrong {
    public static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(n > 0){
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem,digits); //double->int
            n = n/10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(n + " is Armstrong? " + isArmstrong(n));
    }
}
