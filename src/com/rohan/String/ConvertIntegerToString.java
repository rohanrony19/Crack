package com.rohan.String;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class ConvertIntegerToString {
    public static String intToStr(int num){
        if(num == 0)return "0";
        boolean negative = num < 0;
        if (negative) num = -num;

        StringBuilder sb = new StringBuilder();
        while (num>0){
            int digit = num%10;
            sb.append((char)(digit + '0'));
            num = num/10;
        }
        if(negative) sb.append('-');
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str1 = intToStr(1234);
        String str2 = intToStr(-5678);

//        int num = Integer.parseInt((String) str1);
//        String name = String.valueOf((int) num);
//
//        System.out.println("String: " + num + ", Datatype: " + ((Object) num).getClass().getSimpleName());
//        System.out.println("String: " + name + ", Datatype: " + name.getClass().getSimpleName());

        System.out.println("String: " + str1 + ", Datatype: " + str1.getClass().getSimpleName());
        System.out.println("String: " + str2 + ", Datatype: " + str2.getClass().getSimpleName());

    }
}
