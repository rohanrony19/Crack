package com.rohan.Algorithm.search;

public class Linear {
  public static int search(int []arr, int target){
      if(arr.length == 0) return -1;

      for(int i = 0; i < arr.length; i++){
          if(arr[i] == target){
              return i; //index
          }
      }
//      for (int element:arr){
//          if (element == target){
//              return element;
//          }
//      }
      return -1;
  }
    public static void main(String[] args) {
        int [] arr = {10,20,30,80,50,60};  // index 5 , length 6
        int target = 50;
        int res = search(arr,target);
        System.out.println(res);
    }}