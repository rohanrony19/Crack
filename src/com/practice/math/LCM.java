package com.practice.math;
/*
    "The smallest number that both numbers can divide exactly."
    12 = 12, 24, 36, 48, 60, 72, 84 ...
    15 = 15, 30, 45, 60, 75, 90, 105 ...
    => Lowest common multiple = 60

    12 = 1,2,3,4,6,12
    15 = 1,3,5,15
    => gcd = 3
    => lcm = 12 * 15 / 3 = 180 / 3 => 60
 */
public class LCM {
    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 12, b = 15;
        int lcm = (a*b)/gcd(a,b);
        System.out.println("LCM : " +lcm);
    }
}
