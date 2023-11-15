package com.java;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class StockBuySellDay22Test {

	@Test
	public void stockBuySell() {
		int prices[] = { 100, 180, 260, 310, 40, 535, 695 };
		int n=7;
		List<Integer> expectedResult =  Arrays.asList(0, 3, 4, 6);
		List<Integer> actualResult = StockBuySellDay22.stockBuySell(prices, n);
		 assertThat(actualResult).isEqualTo(expectedResult);
		

	}
}
