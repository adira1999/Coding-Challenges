package edu.coding.array.shufflearray;

public class Solution {

    public static void main(String[] args) {
        int[] nums =  {2,5,1,3,4,7};
        int[] newArray = shuffleArray(nums,nums.length);
        System.out.println(newArray);
    }

    private static int[] shuffleArray(int[] nums, int length) {
        int[] newArray = new int[length];

        int newOffset = (nums.length/2) ;
        int zeroOffset = 0 ;

        for(int i = 0;i<nums.length;i++){
            if(i % 2 == 0){
                newArray[i] = nums[zeroOffset];
                zeroOffset++;
            } else {
               newArray[i] = nums[newOffset];
               newOffset++;
            }
        }


        return newArray;
    }

}
