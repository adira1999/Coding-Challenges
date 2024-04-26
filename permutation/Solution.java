package edu.coding.array.permutation;

//Leetcode 1920. Build Array from Permutation =https://leetcode.com/problems/build-array-from-permutation/

public class Solution {
    public static void main(String[] args) {
        int[] nums =  {1,0,2};
        int[] ans = buildArray(nums);
    }

    private static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
//            int p = i;
//            p = nums[i];
            ans[i] = nums[nums[i]];
        }

      for(int i=0;i<ans.length;i++){
          System.out.println(ans[i]);
      }

        return ans;

    }
}
