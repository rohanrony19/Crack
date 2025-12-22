package com.rony.rohan.String;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        String name = "Java is Programming Language";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) != ' '){
                sb.append(name.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
