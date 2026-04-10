package com.rony.dsa.arrays.hmm;

import java.util.Scanner;

public class WorkingSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter initial value of working");
        double working = sc.nextInt();
        double idle = 0;

        for (int i = 1; i <= 5; i++) {
            double newWorking = 0.6*working+0.3*idle;
            double newIdle = 0.4*working + 0.7*idle;

            working = newWorking;
            idle = newIdle;
        }

        System.out.println(working + " " + idle);

    }
}
