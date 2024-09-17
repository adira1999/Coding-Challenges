import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Q.Given a sorted array of integers arr and a target value target, find two numbers in the array that sum to the target.

public class TwoSum {

    //sorted array case

    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;

        int[] twoSum = twoSum(nums,target);
        for(int i=0; i<twoSum.length;i++){
            System.out.println(twoSum[i]);
        }

    }

    private static int[] twoSum(int[] nums, int target) {

        int left =0;
        int right = nums.length -1 ;

        while (left<right){

            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[] {left+1,right+1};
            }else if( sum > target){
                right--;
            } else{
                left++;
            }

        }
        return new int[] {-1,-1};
    }
}
