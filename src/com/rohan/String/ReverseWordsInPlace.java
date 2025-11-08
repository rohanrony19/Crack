package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class ReverseWordsInPlace {
    public static void main(String[] args) {
        char[] sentence = "Java is Programming Language".toCharArray();

        int start = 0;
        for (int end = 0; end <= sentence.length; end++) {
            if (end == sentence.length || sentence[end] == ' ') {
                reverse(sentence, start, end - 1);
                start = end + 1;
            }
        }
        System.out.println(sentence);
    }


    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

