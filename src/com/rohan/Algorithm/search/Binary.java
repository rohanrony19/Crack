package com.rohan.Algorithm.search;
// Time Complexity = O(log n)
// Space Complexity = O(1)
public class Binary {
    public static int search(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
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
        int target =400;
        int res=search(arr,target);
        System.out.println(res);
    }
}

