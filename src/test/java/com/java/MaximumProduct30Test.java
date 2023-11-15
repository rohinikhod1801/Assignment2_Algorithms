package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumProduct30Test {

	@Test
	public void maximumProductSubArray(){
		int arr[]={6,-3,-10,0,2};
		assertEquals(180, MaximumProduct30.maxProduct(arr));
	}

}
