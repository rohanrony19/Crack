package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class RemoveDuplicates {
    public static void main(String[] args) {
        String name = "RohanoOo";
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();
        for (char c : name.toCharArray()) {
            if (!seen[c]){
                result.append(c);
                seen[c] = true;
            }
        }

        
        System.out.println("String after removing duplicates: " + result.toString());
    }
}
