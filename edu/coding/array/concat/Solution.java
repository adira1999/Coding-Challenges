package edu.coding.array.concat;

public class Solution {

    public static void main(String[] args) {
        int[] nums =  {1,2,3};
        int[] ans = getConcatenation(nums);

    }

    private static int[] getConcatenation(int[] nums) {

        int ans[] = new int[2 * nums.length];

        int newArrayLength = 2 * nums.length;
        int pointer = newArrayLength/2;

        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }

        for(int i=0;i<nums.length && pointer<newArrayLength;i++){
            ans[pointer] = nums[i];
            pointer++;
        }
        return ans;
    }
}
