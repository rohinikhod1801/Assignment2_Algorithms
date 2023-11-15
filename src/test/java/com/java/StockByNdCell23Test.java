package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StockByNdCell23Test {
	
	@Test
	public void testMaxProfit() {
		int[] prices = { 3, 4, 1, 5 };
		int actualResult=5;
		int expectedResult=StockByNdCell23.stockBuyAndSell(prices);
		assertEquals(actualResult, expectedResult);
	}
}
