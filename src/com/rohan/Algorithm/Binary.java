package com.rohan.Algorithm;

public class Binary {

    public static int search(int [] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                  start=mid+1;


            }
            else{
                  end=mid-1;
                             }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};  // index 5 , length 6
        int key =40;
        int res=search(arr,key);
        System.out.println(res);
    }}

