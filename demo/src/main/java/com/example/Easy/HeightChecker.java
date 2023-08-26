package com.example.Easy;

public class HeightChecker {
    
    public int heightChecker(int[] heights) {

        int counter = 0;
        int[] sortedArray = new int[heights.length];

        System.arraycopy(heights, 0, sortedArray, 0, heights.length);
        Arrays.sort(sortedArray);

        for(int i = 0; i<heights.length; i++) {
            if(sortedArray[i]!=heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}
