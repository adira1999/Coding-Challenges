package com.binarysearch.searchAndInsert;

//https://www.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1

public class Solution {
    public static void main(String[] args) {
        int[] arr = {-86, -82, -54, -35, -15, 2, 3, 4, 8, 9, 10, 13, 16, 17, 18, 19, 23, 24, 25,
                28, 29, 30, 33, 34, 36, 37, 40, 41, 43, 47, 52, 53, 54, 57, 60, 64, 66,
                68, 71, 73, 76, 78, 80, 81, 83, 86, 87, 93, 96, 97, 99};
        int target = -99;
        int index = searchInsertK(arr,arr.length,target);
        System.out.println(index);
    }

    private static int searchInsertK(int[] Arr, int length, int k) {
        int index =-1;

        int left = 0;
        int right = Arr.length-1;

        if(k == 0){
            return 0;
        }

        while(left<=right){
            int mid = (left+right)/2;
            if(Arr[mid]==k){
                index = mid;
                return index;

            } else if(k<Arr[mid]){
                right = mid-1;

            } else{
                left = mid+1;

            }
        }

        if(index==-1){
            index  = left;
        }


        return index;
    }
}
