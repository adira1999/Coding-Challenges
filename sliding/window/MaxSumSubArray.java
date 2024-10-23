package sliding.window;

public class MaxSumSubArray {

    //Given an array of integers nums and an integer k, find the maximum sum of any contiguous subarray of size k.

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSumSubarray(nums, k));
    }

    private static int maxSumSubarray(int[] nums, int k) {

        int maxSum =0;
        int currentSum =0;

        //Step 1 : Get the sum of first 3 elements
        for(int i=0;i<k;i++){
            currentSum += nums[i];
        }

        maxSum = currentSum;

        //step 2 :Slide the window over the array
        for(int i=k;i<nums.length-1;i++){
            currentSum = currentSum - nums[i-k]+ nums[i];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
