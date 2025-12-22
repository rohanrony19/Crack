package com.rony.rohan.Algorithm.search;

public class LinearSearchChar {
    public static void main(String[] args) {
        String name = "Rohan";
        char ch = 'a';
        System.out.println(search(name,ch));
        System.out.println(search1(name,ch));
        System.out.println(search2(name,ch));
    }

    public static boolean search(String name,char target){
        if(name.length() == 0) return false;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    public static int search1(String name,char target){
        if(name.length() == 0) return -1;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static String search2(String name,char target){
        if(name.length() == 0) return "not found";
        for (char ch:name.toCharArray()){
            if (ch == target){
                return String.valueOf(ch);
            }
        }
        return "not found";
    }
}
