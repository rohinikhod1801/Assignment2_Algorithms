package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingNumArray25Test {

	@Test
	public void testFindMissing(){
		int arr[]={1,2,3,4,5};
		assertEquals(0, MissingNumArray25.missingNumber(arr, 5));

	}

}
