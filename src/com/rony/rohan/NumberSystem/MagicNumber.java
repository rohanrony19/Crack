package com.rony.rohan.NumberSystem;

/*
     16  8   4   2   1
    5^5 5^4 5^3 5^2 5^1
5 =  0   0   1   0   1
  => 0 + 0 +125+ 0 + 5 = 130

6 =  0   0   1   1   0
  => 0 + 0 +125+ 25 +0 = 150

8 =  0   1   0   0   0
  => 0+ 625 + 0 + 0 + 0 = 625
 */
public class MagicNumber {
    public static void main(String[] args) {
        int n = 7;

        int ans = 0;
        int base = 5;
        while (n > 0){
            int last = n & 1;
            n = n >> 1;     //          8 4 2 1
                            // 8 >> 1 = 1 0 0 0 >> 1 = 0 1 0 0 = 4
                            // 7 >> 1 = 0 1 1 1 >> 1 = 0 0 1 1 = 3
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
