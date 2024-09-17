import java.util.Arrays;
import java.util.HashMap;

public class TwoSumUnsorted {

    public static void main(String[] args) {

        int[] nums = {3,2,4,1,7,8,5};
        int target = 13;

        int[] array = twoSumUnsorted(nums,target);
        for (int j : array) {
            System.out.println(j);
        }

    }

    private static int[] twoSumUnsorted(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(nums[i],i);
        }



        return new int[]{-1,-1};
    }
}
