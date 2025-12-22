package com.rony.rohan.NumberSystem;
// t = O(log(n)), s = O(1)
public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int decimal = 3;
        System.out.printf("%.3f", sqrt(n,decimal));
    }

    static double sqrt(int n,int dec){
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s<e){
            int m = s + (e - s) / 2;
            if(m * m == n){
                return m;
            }
            if(m * m > n){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        double incre = 0.1;
        for (int i = 0; i < dec; i++) {
            while (root * root < n){
                root += incre;
            }
            root -= incre;
            incre /= 10;
        }
        return root;
    }
}
