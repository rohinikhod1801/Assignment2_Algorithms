package com.java;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZigZag12Test {

	@Test
	public void zigZagArray() {
		int n = 7;
		int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
		int result =  ZigZag12.zigZag(arr, n);
		assertEquals(n, result);

	}
}
