package com.rony.rohan.String;

public class StrStrImpl {
    public static int strStr(String haystack,String needle){
        if(needle.isEmpty())return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
