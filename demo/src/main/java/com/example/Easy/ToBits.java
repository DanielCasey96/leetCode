package com.example.Easy;

public class ToBits {
    
    public int[] countBits(int n) {

        int[] numbersArray = new int[n+1];
        String[] bitArray = new String[n+1];
        int[] returnArray = new int[n+1];

        int i;
        for(i=0; i<=n; i++) {
            numbersArray[i] = i;
            bitArray[i] = Integer.toBinaryString(numbersArray[i]);
            returnArray[i] = bitArray[i].replaceAll("0", "").length();
        }
        return returnArray;
    }
}
