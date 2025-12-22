package com.rony.rohan.String;

public class SearchACharacterInString {
    public static void main(String[] args) {
        String name = "Rohan";
        char target = 'o';
        boolean isFound = false;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                System.out.println("Character " + target + " found at index " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Character " + target + " not found in String");
        }
    }
}
