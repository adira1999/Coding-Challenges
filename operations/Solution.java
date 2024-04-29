package edu.coding.array.operations;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class Solution {
    public static void main(String[] args) {
        String[] operations = {"++X","++X","X++"};
        finalValueAfterOperations(operations);
    }

    private static void finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (String operation : operations) {
            switch (operation) {
                case "X++":
                    value++;
                    break;

                case "++X":
                   ++value;
                   break;

                case "X--":
                    value--;
                    break;

                case "--X":
                    --value;
                    break;
            }

        }
        System.out.println(value);
    }
}
