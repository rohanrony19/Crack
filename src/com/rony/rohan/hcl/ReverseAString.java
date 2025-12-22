package com.rony.rohan.hcl;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "Rohan";

        String rev = "";
        for (int i = name.length()-1; i >=0 ; i--) {
             rev += name.charAt(i);
        }
        System.out.println(rev);

        char[] arr = name.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(new String(arr));
    }
}
