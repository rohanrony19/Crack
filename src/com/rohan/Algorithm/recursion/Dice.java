package com.rohan.Algorithm.recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",4);

        ArrayList<String> ans = diceReturn("",4);
        System.out.println(ans);

        diceFace("",6,8);

        ArrayList<String> ans1 = diceFaceReturn("",6,8);
        System.out.println(ans1);
    }

    static void dice(String p,int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i,target - i);
        }
    }

    static ArrayList<String> diceReturn(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceReturn(p + i,target - i));
        }
        return list;
    }

    static void diceFace(String p,int target,int face){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i,target - i,face);
        }
    }

    static ArrayList<String> diceFaceReturn(String p, int target,int face){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceReturn(p + i,target - i,face));
        }
        return list;
    }

}
