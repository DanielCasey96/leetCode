package com.example;

import com.example.Easy.BestTimeToBuyAndSellStock;
import com.example.Easy.ClimbingStairs;
import com.example.Easy.Fibonacci;
import com.example.Easy.FindTheDifference;
import com.example.Easy.HappyNumber;
import com.example.Easy.HeightChecker;
import com.example.Easy.KeyboardRow;
import com.example.Easy.LengthOfLastWord;
import com.example.Easy.LongestCommonPrefix;
import com.example.Easy.MajorityElement;
import com.example.Easy.MergeTwoSortedLists;
import com.example.Easy.MoveZeros;
import com.example.Easy.Palindrome;
import com.example.Easy.PlusOne;
import com.example.Easy.PowerOfTwo;
import com.example.Easy.RomanNumberals;
import com.example.Easy.SingleNumber;
import com.example.Easy.ToBits;
import com.example.Easy.TwoSum;
import com.example.Easy.ValidAnagram;
import com.example.Easy.ValidPalindrome;

public class Main {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBASStock = new BestTimeToBuyAndSellStock();
        bestTimeToBASStock.maxProfit3(new int[]{7,4,1,2});    

        ClimbingStairs climbingStairs = new ClimbingStairs();
        climbingStairs.climbStairs(83);

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fib(29);

        FindTheDifference findTheDifference = new FindTheDifference();
        findTheDifference.findTheDifference("abcd","abcde");

        HappyNumber happyNumber = new HappyNumber();
        happyNumber.isHappy(2);

        HeightChecker heightChecker = new HeightChecker();
        happyNumber.heightChecker(new int[]{1,2,3,4,5});

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.findWords(new String[]{"qwety", "qwety", "qad", "qwety"});

        LengthOfLastWord lastWord = new LengthOfLastWord();
        lastWord.lengthOfLastWord("   fly me   to   the moon       ");

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.longestCommonPrefix(new String[]{"cir","car"});

        MajorityElement majorityElement = new MajorityElement();
        majorityElement.majorityElement(new int[]{1, 2, 1, 1, 1, 2, 2, 2, 1});

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists("1,2,3,4,5","4,5,6,7,8,9");

        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(new int[]{0});

        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(151);

        PlusOne plusOne = new PlusOne();
        plusOne.plusOne(new int[]{5,9,9});

        PowerOfTwo powerOfTwo = new PowerOfTwo();
        powerOfTwo.isPowerOfTwo(268435455);

        RomanNumberals romanNumberals = new RomanNumberals();
        romanNumberals.romanToInt("IV");

        SingleNumber singleNumber = new SingleNumber();
        singleNumber.singleNumber(new int[]{1, 2, 1, 3, 3});

        ToBits toBits = new ToBits();
        toBits.countBits(2);

        TwoSum twoSum = new TwoSum();
        int[] passin = {2,5,5,11};
        twoSum.twoSum(passin, 10);

        ValidAnagram validAnagram = new ValidAnagram();
        validAnagram.isAnagram("CCNC", "CCNN");

        ValidPalindrome validPalindrome = new ValidPalindrome();
        validPalindrome.isPalindrome("`l;`` 1o1 ??;l`");
    }
}