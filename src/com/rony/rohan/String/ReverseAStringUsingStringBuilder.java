package com.rony.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class ReverseAStringUsingStringBuilder {
    public static void main(String[] args) {
        String name = "Rohan";
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
