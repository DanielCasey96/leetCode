package com.example.Easy;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {

        int i;
        int j;

        for(i=0; i<nums.length; i++) {
            int valueOne = nums[i];

            for(j=i+1; j<nums.length; j++) {
                int valueTwo = nums[j];

                if(valueOne+valueTwo == target) {
                    int[] returnPosition = {i,j};
                    return returnPosition;
                }
            }
        }
        return null;
    }

    /*   public int[] twoSum(int[] nums, int target) {
        int i;
        int j;

        for(i=0; i<nums.length; i++) {

            for(j=i+1; j<nums.length; j++) {

                if(nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    second solution i felt was better but was slower and used more memory?
     */
}
