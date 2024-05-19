package com.binarysearch.findCircularRotationCount;

import java.util.Arrays;

public class CircularCount {
    public static void main(String[] args) {
        int[] nums = {8,9,10,11,2,5,6};
        int count = findRotationCount(nums);
        System.out.println(count);
    }

    private static int findRotationCount(int[] nums) {

        int left =0;
        int right =nums.length-1;

        while(left<=right){

            //1.array is already sorted
            if(nums[left] <= nums[right]){
                return left;
            }

            int mid = (left + right)/2;

            // find the next and previous element of the `mid` element
            // (in a circular manner)

            int next = (mid+1) % nums.length;
            int prev = (mid-1 + nums.length) % nums.length;


            //2.if the `mid` element is less than both its next and previous
            // neighbor, it is the array's minimum element
            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]){
                return mid;
            }

            // 3.if nums[mid…right] is sorted, and `mid` is not the minimum element,
            // then the pivot element cannot be present in nums[mid…right],
            // discard nums[mid…right] and search in the left half

            else if (nums[mid] <= nums[right]) {
                right = mid - 1;
            }

            // 4.if nums[left…mid] is sorted, then the pivot element cannot be present
            // in it; discard nums[left…mid] and search in the right half

            else if (nums[mid] >= nums[left]) {
                left = mid + 1;
            }
        }


        return -1;
    }
}
