package com.rohan.Algorithm;

public class Linear {
  public static int search(int []arr, int key){
      for(int i=0;i<arr.length;i++){
          if(arr[i]==key){
              return i;
          }
      }
      return -1;
  }
    public static void main(String[] args) {
        int [] arr={10,20,30,80,50,60};  // index 5 , length 6
        int key =40;
        int res=search(arr,key);
        System.out.println(res);
    }}