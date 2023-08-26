package com.example.Easy;

public class BestTimeToBuyAndSellStock {

public int maxProfit3(int[] prices) {
        int min = prices[0];
        int max = 0;
        int profit = 0;
        int profitCheck = 0;

        for(int i = 1; i<prices.length; i++) {
            if(min>prices[i]) {
                min = prices[i];
            } else if(max<=prices[i]  || profit == 0) {
                max=prices[i];
                profit=max-min;
                if(profitCheck<profit) {
                    profitCheck = profit;
                    max=0;
                }
            }
        }
        System.out.println(profitCheck);
        return profitCheck;
    }


    public int maxProfit1(int[] prices) {

        int profit = 0;
        int checkJ = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = 1 + i; j < prices.length; j++) {
                if (prices[j] > prices[i] && checkJ < prices[j]) {
                    checkJ = prices[j];
                    int exact = prices[j] - prices[i];
                    if (exact > profit) {
                        profit = exact;
                    }
                }
            }
            checkJ = 0;
        }
        System.out.println("BUY AND SELL STOCK");;
        return profit;
    }

}