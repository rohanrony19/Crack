package com.rony.rohan.NumberSystem;

// Decimal  => Binary digits
// (34567) base10 = (?)10 base10 => 5 Digits = 34567
// (34567) base10 = (?)2 base2 => 16 Digits =  1000011100000111 = 16 digits
/*
        2^0 = 1 = 1
        2^1 = 2 = 2
        2^2 = 4 = 3
        2^3 = 8 = 4
        2^4 = 16 = 5
        2^5 = 32 = 6
        2^6 = 64 = 7
        2^7 = 128 = 8
        2^8 = 256 = 9
        2^9 = 512 = 10
        2^10 = 1024 = 11
        2^11 = 2048 = 12
        2^12 = 4096 = 13
        2^13 = 8192 = 14
        2^14 = 16384 = 15
        2^15 = 32768 = 16
        2^16 = 65536 = 17
 */

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 34567;
        int b = 2;

        int ans = (int) (Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
