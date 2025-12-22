package com.rony.rohan.Algorithm.recursion;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,8,5};
        int target = 8;
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexLast(arr,target,arr.length-1));

//        findAllIndex(arr,target,0);
//        System.out.println(list);

        ArrayList<Integer> ans = findAllIndex(arr,target,0,new ArrayList<>());
        System.out.println(ans);

//        System.out.println(findAllIndex2(arr,target,0));
    }

    static boolean find(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }

    static int findIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target ){
            return index;
        }
        return findIndex(arr,target,index+1);
    }

    static int findIndexLast(int[] arr,int target,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target ){
            return index;
        }
        return findIndexLast(arr,target,index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target ){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

//    static ArrayList<Integer> list = new ArrayList<>(); // this list reference is being passed as an argument fot this method
//    internal the list using this only
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target ){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }

    // without an argument list
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target ){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
