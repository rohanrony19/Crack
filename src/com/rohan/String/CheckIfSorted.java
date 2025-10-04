package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class CheckIfSorted {
    public static void main(String[] args) {
        String name = "abcdefgh";
        boolean isSorted = true;
        for (int i = 0; i < name.length()-1; i++) {
            if (name.charAt(i) > name.charAt(i+1)){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println(name + " is sorted");
        }else {
            System.out.println(name + " is not sorted");
        }
    }
}
