package com.practice.math;

public class ProductDigits {
    public static void main(String[] args) {
        int n = 235;
        int product = 1;
        while (n > 0){
            product *= n % 10;
            n /= 10;
        }
        System.out.println("Product: " + product);
    }
}
