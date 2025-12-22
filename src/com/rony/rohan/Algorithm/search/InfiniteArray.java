package com.rony.rohan.Algorithm.search;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,120,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target lie in the range
        while(target > arr[end]){
            int temp = end + 1; // this is my new start
            // double the box size
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
//      whether the array is sorted in ascending order
        while(start <= end){
//            int mid = (start+end) / 2;  possibility that it may exceed int range
            int mid=start+(end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
