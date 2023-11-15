package com.java;

public class StockByNdCell23 {

	    public static int stockBuyAndSell(int[] prices) {
	        int maxProfit = 0;

	        for (int i = 1; i < prices.length; i++) {
	            if (prices[i] > prices[i - 1]) {
	                maxProfit += prices[i] - prices[i - 1];
	            }
	        }

	        return maxProfit;
	    }

	    public static void main(String[] args) {
	        int[] prices1 = {3, 4, 1, 5};

	        System.out.println("Maximum profit for prices1: " + stockBuyAndSell(prices1));
	    }
	}

