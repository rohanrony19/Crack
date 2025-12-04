package com.rohan.Algorithm.recursion.string;

/*
substring(0)	"baccadah"	"baccadah"
substring(1)	"baccadah"	"accadah",  skip 1 character
substring(0,1)	"baccadah"	"b"
substring(1,5)	"baccadah"	"acca"
substring(6)	"baccadah"	"h" ,skip 6 character
 */
public class SkipLetter {
    public static void main(String[] args) {
        String name= "baccadah";
        skip("",name);
        System.out.println(skip(name));
        System.out.println(skipApple("bacappleda"));
        System.out.println(skipAppNotApple("bapcappplcdca"));
    }

    static void skip(String process,String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }

        char ch = unprocess.charAt(0);

        if(ch == 'a'){
            skip(process,unprocess.substring(1)); //accadah
        }else {
            skip(process + ch,unprocess.substring(1));
        }
    }

    static String skip(String unprocess){
        if(unprocess.isEmpty()){
            return "";
        }

        char ch = unprocess.charAt(0);

        if(ch == 'a'){
            return skip(unprocess.substring(1)); //accadah
        }else {
            return ch + skip(unprocess.substring(1));
        }
    }

    static String skipApple(String unprocess){
        if(unprocess.isEmpty()){
            return "";
        }

        if(unprocess.startsWith("apple")){
            return skipApple(unprocess.substring(5)); //accadah
        }else {
            return unprocess.charAt(0) + skipApple(unprocess.substring(1));
        }
    }

    static String skipAppNotApple(String unprocess){
        if(unprocess.isEmpty()){
            return "";
        }

        if(unprocess.startsWith("app") && !unprocess.startsWith("apple")){
            return skipAppNotApple(unprocess.substring(5)); //accadah
        }else {
            return unprocess.charAt(0) + skipAppNotApple(unprocess.substring(1));
        }
    }
}
