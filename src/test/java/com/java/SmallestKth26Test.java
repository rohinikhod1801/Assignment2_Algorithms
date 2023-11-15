package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestKth26Test {

	@Test
	public void kthElemet(){
		int[] arr={7,10,4,3,20,15};
		int k=3;
		assertEquals(7, SmallestKth26.kthSmallest(k,arr));

	}
}
