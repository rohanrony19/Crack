package com.rony.rohan.hcl;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String name = "Java is Programming language";
        char[] word = name.toCharArray();
        int start = 0;
        for (int end = 0;end<= word.length;end++){
            if (end == word.length || word[end] == ' '){
                reverse(word,start,end-1);
                start = end + 1;
            }
            System.out.println(name);
        }
    }
    static void reverse(char[] arr ,int start,int end){
        while (start<end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
