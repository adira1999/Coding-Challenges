package sliding.window;

public class SmallestSubArraySUm1 {

    //Given an array of integers nums and an integer S,
    // find the length of the smallest contiguous subarray whose sum
    // is greater than or equal to S. If no such subarray exists, return 0.

    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int targetSum = 4;

        System.out.println("Smallest subarray length with sum >= " + targetSum + " is: " + minSubArrayLen1(targetSum, nums));

    }

    private static int minSubArrayLen1(int targetSum, int[] nums) {


        int startPointer =0;
        int minLength = Integer.MAX_VALUE;

        int currentSum =0;
        int smallestLength =0;
        int currentArrayLength =0;

        for(int i = 0;i< nums.length;i++){
            currentSum= currentSum+nums[i];
            currentArrayLength++;


            // Shrink the window from the left until the sum is smaller than targetSum
            while (currentSum >= targetSum){

                minLength = Math.min(minLength, currentArrayLength);
                currentSum = currentSum - nums[startPointer];
                startPointer++;
                currentArrayLength--;
                smallestLength = minLength;

            }

        }



        return smallestLength;

    }

}
