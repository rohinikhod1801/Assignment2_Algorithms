package com.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LargestElement13Test {

	@Test
	public void testLargestElement13(){
		int arr[]={2,4,1,3,5};
		int result=LargestElement13.thirdLargest(arr);
		assertEquals(3,result);
	}
	
	@Test
	public void testNotThirdLargestElement13(){
		int arr[]={1,2};
		int result=LargestElement13.thirdLargest(arr);
		assertEquals(-1,result);
	}
	
}
