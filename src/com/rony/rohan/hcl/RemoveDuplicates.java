package com.rony.rohan.hcl;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String name = "roonyyyy";
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();
        for (char c : name.toCharArray()){
            if (!seen[c]){
                result.append(c);
                seen[c] = true;
            }
        }
        System.out.println(result);
    }
}
