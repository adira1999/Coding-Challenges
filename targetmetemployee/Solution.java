package edu.coding.array.targetmetemployee;



public class Solution {
    public static void main(String[] args) {
        int[] hours = {2,3,1,6};
        int target = 2;
        int count = numberOfEmployeesWhoMetTarget(hours,target);
        System.out.println(count);
    }

    private static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int count = 0;
        for(int i=0;i<hours.length;i++){
            if(hours[i] >= target){
                count++;
            }
        }
        return count;
    }
}
