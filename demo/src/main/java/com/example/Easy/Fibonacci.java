package com.example.Easy;

public class Fibonacci {
    
    public int fib(int n) {
        if(n==0) {
            return 0;
        }
        int old = 1;
        int extraOld = 0;
        int current = 1;
        for(int k = 2; k<=n; k++) {
            current = extraOld + old;
            extraOld = old;
            old = current;
        }
        System.out.println("FIBONACCI");
        System.out.println("Value of current" + current);
        return current;
    }
}
