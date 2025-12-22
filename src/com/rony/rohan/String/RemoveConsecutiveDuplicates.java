package com.rony.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbbbccccddde";
        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1)){
                sb.append(str.charAt(i));
            }
        }
        System.out.println("After Removal : " + sb.toString());
    }
}
