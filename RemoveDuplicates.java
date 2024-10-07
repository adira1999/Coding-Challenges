import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {1,1,2};
        //new array = {1,2,3,4}

        //int newArray = uniqueArray(array);
        int length = uniqueArray(array);
        System.out.println(length);

    }

    private static int uniqueArray(int[] nums) {

        int left =0;

        for(int right =1;right < nums.length;right++){
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
        }

        return left+1;



//        int right = left+1;
//
//        List<Integer> list = new ArrayList<>();
//
//        while(left < right && right <= nums.length-1){
//            if(nums[left] != nums[right]){
//                list.add(nums[left]);
//            }
//            if(right == nums.length-1){
//                list.add(nums[right]);
//            }
//
//            left++;
//            right++;
//
//        }
//
//        int[] newArray = list.stream().mapToInt(Integer::intValue).toArray();
//
//        for(int num:newArray){
//            System.out.println(num);
//        }
//        System.out.println(newArray.length);
//
//        return newArray.length;
    }


}
