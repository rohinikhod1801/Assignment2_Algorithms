package com.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class LastOccurrences18Test {

	@Test
	public void firstAndLast() {
		int arr[] = { 1, 2, 3, 4, 2, 5, 2, 6 };
		int n = arr.length;
		int a = 2;
		List<Integer> result = LastOccurrences18.firstAndLast(arr, n, a);
		assertNotNull(result);

	}
}
