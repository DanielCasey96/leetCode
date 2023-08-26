package com.example.Easy;

import java.util.Arrays;

public class Palindrome {
    
     public boolean isPalindrome(int x) {

        String stringX = String.valueOf(x);
        char[] forwardArray = stringX.toCharArray();
        char[] backwardsArray = new char[forwardArray.length];

        int i;
        for(i=forwardArray.length; i>0; i--) {
            backwardsArray[forwardArray.length - i] = forwardArray[i-1];
        }

        return Arrays.equals(forwardArray, backwardsArray);
    }
}
