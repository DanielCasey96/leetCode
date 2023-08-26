package com.example.Easy;

import java.util.ArrayList;

public class SingleNumber {
    
    public int singleNumber(int[] nums) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int value = 0;
        for(int i = 0; i<nums.length; i++) {
            value = value + nums[i];
            if(numbers.contains(nums[i])) {
                value = value - nums[i] * 2;
            }
            numbers.add(i, nums[i]);
        }
       return value;
    }
    //2000ms runtime
    //54.8MB memory usage

    public int singleNumber2(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
            count = 0;
        }
        return -1;
    }
    //498ms runtime
    //50.4MB memory usage
}
