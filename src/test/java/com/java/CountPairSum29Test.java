package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountPairSum29Test {

	@Test
	public void countPair() {
		int[] arr = {1, 5, 7, 1};	
		int k = 6;
		assertEquals(2, CountPairSum29.getPairsCount(k,arr));

	}

}
