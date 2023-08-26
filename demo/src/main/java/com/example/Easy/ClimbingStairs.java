package com.example.Easy;

public class ClimbingStairs {
    
    public int climbStairs(int n) {
        int old = 1;
        int extraOld = 0;
        int current = 1;
        for (int k = 1; k <= n; k++) {
            current = extraOld + old;
            extraOld = old;
            old = current;
        }
        System.out.println("CLIMING STAIRS");;
        return current;
    }
}
