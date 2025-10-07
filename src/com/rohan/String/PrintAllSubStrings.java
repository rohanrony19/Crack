package com.rohan.String;
// Time Complexity = O(n^2)
// Space Complexity = O(n^2)
public class PrintAllSubStrings {
    public static void main(String[] args) {
        String name = "abc";
        for (int i = 0; i < name.length(); i++) {
            for (int j = i; j < name.length(); j++) {
                System.out.println(name.substring(i,j+1));
            }
        }
    }
}
