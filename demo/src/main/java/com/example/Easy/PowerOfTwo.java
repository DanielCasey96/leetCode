package com.example.Easy;

public class PowerOfTwo {
    
    public boolean isPowerOfTwo(int n) {
        int loopingValue = n;

        if(n == 1 | n == 2) {
            return true;
        }

        for (int i = 1; i < n; i++) {
            if (loopingValue % 2 == 0) {
                loopingValue = loopingValue / 2;
                if (loopingValue == 2) {
                    System.out.println("true");
                    return true;
                }
            } else break;
        }
        System.out.println("false");
        return false;
    }
}

// if i can be divided by 2 n % 2 == 0
//divide it by 2 to get a new value
//keep going till you reach
// not a divisable number by 2
// or 2
//return the number of loops}
