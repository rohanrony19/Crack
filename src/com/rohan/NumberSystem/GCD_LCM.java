package com.rohan.NumberSystem;
// gcd(4,8)
/*
    4 = 4 / 4, 4 / 2, 4 / 1
    highest number divisible by 4 is 4
    8 = 8 / 8, 8 / 4, 8 / 2, 8 / 1
    highest number divisible by 8 is 4
    both have 4 = hcf

Example: HCF(12, 18)
Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18
Common: 1, 2, 3, 6 → **HCF = 6** ✓[web:444][web:445]
 */

//lcm(4,8)
/*
    36 bcz 4 and 8 is the highest number that can be divided by 36
Example: LCM(12, 18)
Multiples of 12: 12, 24, 36, 48, ...
Multiples of 18: 18, 36, 54, ...
Common: 36, 72, ... → **LCM = 36** ✓[web:444][web:447]
 */

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(8,12));
        System.out.println(lcm(12,18));
    }

    static int gcd(int a,int b){
        if (a == 0){
            return b;
        }
        return gcd(b % a,a);
    }

    static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}
