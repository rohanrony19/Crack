package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class ConvertStringToIntegerWithoutParse {
    public static int myAtoi(String str){
        int num=0,sign=1,i=0;

        if(str.charAt(0)=='-'){
            sign = -1;
            i++;
        }else if(str.charAt(0)=='+'){
            i++;
        }
        for ( ;i < str.length(); i++) {
            char c= str.charAt(i);
            if(c < '0' || c > '9')break;
            num = num *10+(c-'0');
        }
        return sign*num;
    }
    public static void main(String[] args) {
        Integer str1 = myAtoi("1234");
        Integer str2 = myAtoi("-5678");

        // Print value and data type (class name) for each result
        System.out.println("Value: " + str1 + " | Type: " + str1.getClass().getSimpleName());
        System.out.println("Value: " + str2 + " | Type: " + str2.getClass().getSimpleName());
    }
}
