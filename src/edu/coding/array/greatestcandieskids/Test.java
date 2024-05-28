package edu.coding.array.greatestcandieskids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

public class Test {

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies =1;
        List<Boolean> list = kidsWithCandies(candies,extraCandies);
        System.out.println(list);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list =new ArrayList<>();
        int[] temp = Arrays.copyOf(candies, candies.length);
        Arrays.sort(temp);

        int max = temp[temp.length-1];
        System.out.println(max);
        for(int i=0;i<=candies.length -1;i++){
            boolean b = candies[i] + extraCandies >= max ? true: false;
            list.add(b);
        }

        return list;
    }
}
