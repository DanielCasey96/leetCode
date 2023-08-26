package com.example.Easy;

import java.util.Arrays;

public class ValidPalindrome {
    
     public boolean isPalindrome(String s) {

        String variable1 = s.replaceAll("['.,\\[\\]\\\\:;(){}=!@%$\"&+`*?#_\\-<>^| ]", "").toLowerCase();
        String[] letters = variable1.split("");
        System.out.println(Arrays.toString(letters));

        String[] backwardsLetters = new String[letters.length];

        int i;
        for(i=0; i<letters.length; i++) {
            backwardsLetters[i] = letters[letters.length - i - 1];
        }
        System.out.println(Arrays.toString(backwardsLetters));

        return Arrays.equals(letters, backwardsLetters);
    }

}
