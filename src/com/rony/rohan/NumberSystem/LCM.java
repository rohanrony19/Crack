package com.rony.rohan.NumberSystem;
// The smallest number that is a multiple of both.  ->  LCM(12, 18) = 36 -> 6 * 6 = 36
// Time Complexity = O(log(min(a,b)))
// Space Complexity = O(n)
public class LCM {
    public static int lcm(int a, int b){
        return (a * b) / gcd(a,b);
    }

    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("LCM = " + lcm(a,b));
    }
}
