package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class AllSubset8Test {

	@Test
	void testAllSubset() {
		 int[] arr = {1, 2, 2};
	     int N = arr.length;
	   
	     List<List<Integer>> expectedResult = Arrays.asList(
		Arrays.asList(), Arrays.asList(1), Arrays.asList(1,2), Arrays.asList(1, 2, 2), Arrays.asList(2),
		Arrays.asList(2,2));
		List<List<Integer>> actualResult = AllSubset8.AllSubsets(arr, N);
		
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
}
