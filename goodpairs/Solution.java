package edu.coding.array.goodpairs;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-good-pairs/
public class Solution {
    public static void main(String[] args) {
        int[] nums =  {1,2,3,1,1,3};
        int count = numIdenticalPairs(nums);
        System.out.println(count);
    }

    private static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(i < j){
                      count++;
                    }
            }
        }
    }
        return count;
}
}
