package com.rony.rohan.String;
// Time Complexity = O(n*m)
// Space Complexity = O(1)
public class LongestCommonPrefix {
    public static String lcp(String[] str){
        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            int j=0;
            while (j<prefix.length() && j<str[i].length() && prefix.charAt(j) == str[i].charAt(j)){
                j++;
            }
            prefix = prefix.substring(0,j);
            if(prefix.isEmpty())break;
        }
        return prefix;
    }

    public static void main(String[] args) {
        String [] arr = {"flower","flow","flight"};
        System.out.println(lcp(arr));
    }
}
