package com.rony.rohan.Algorithm.recursion.string;

import java.util.ArrayList;

// abc = cba,bca,bac,cab,acb,abc,
public class Permutations {
    public static void main(String[] args) {
        permutations("","abc");

        System.out.println();
        ArrayList<String> ans = permutationsList("","abc"); // 3! = 3*2*1
        System.out.println(ans);

        System.out.println(permutationsCount("","abcd")); // 4! = 4*3*2*1
    }

    static void permutations(String p,String up){ //processed, unprocessed
        if(up.isEmpty()){
            System.out.print(p + ",");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p, String up){ //processed, unprocessed
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans  = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationsCount(String p,String up){ //processed, unprocessed
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
