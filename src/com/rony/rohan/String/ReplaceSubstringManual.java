package com.rony.rohan.String;

public class ReplaceSubstringManual {
    public static void main(String[] args) {
        String str = "Hello World";
        String target = "World";
        String replacement = "Java";

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - target.length() && str.substring(i,i+target.length()).equals(target)){
                res = res + replacement;
                i = i + target.length()-1;
            }else {
                res =  res + str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
