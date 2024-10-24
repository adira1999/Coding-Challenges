package sliding.window;

public class LongestSubarrayWithSumK {

    //Given an array of positive integers and a positive integer K,
    // find the length of the longest subarray whose sum
    // is less than or equal to K.

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 2};
        int K = 7;
        System.out.println("Longest subarray length: " + longestSubarrayWithSumK(nums, K));

    }

    private static int longestSubarrayWithSumK(int[] nums, int targetSum) {

        int startCounter = 0;
        int currentSum = 0;
        int maxLength = Integer.MIN_VALUE;
        int currentArrayLength = 0;
        int biggestLength = 0;

        for (int i = 0; i < nums.length; i++) {

            currentSum = currentSum + nums[i];
            currentArrayLength++;

            while (currentSum > targetSum) {
                currentSum = currentSum - nums[startCounter];
                startCounter++;
                currentArrayLength--;
            }
            maxLength = Math.max(maxLength, currentArrayLength);
            biggestLength = maxLength;
        }

        return biggestLength;
    }
}
