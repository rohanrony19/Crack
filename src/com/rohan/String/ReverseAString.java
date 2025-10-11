package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity - O(1)
public class ReverseAString {
    static void rev(String name){
        char[] arr = name.toCharArray();
        int start = 0, end = arr.length-1;
        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(new String(arr));
    }
    // Time Complexity = O(n^2)
    // Space Complexity - O(n)
    public static void main(String[] args) {
        String name = "Rohan";
        String rev = "";
        for (int i = name.length()-1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

        rev("Sonia");
    }
}
