package com.rony.dsa.arrays.hmm;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Initial value of pass");
        double pass = sc.nextDouble();
        double fail = 0;

        for (int i = 1; i <= 3; i++) {
            double newPass = (0.8*pass) + (0.4*fail);
            double newFail = (0.2*pass)+ (0.6*fail);

            pass = newPass;
            fail = newFail;
        }

        System.out.printf("%.2f",pass);
        System.out.println();
        System.out.printf("%.2f",fail);
    }
}
