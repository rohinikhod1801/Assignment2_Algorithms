package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FibonacciNth5Test {

	
		@Test
		void testFibonacciNth() {
			int n = 5;
			int expectedResult=5;
			int actualResult= FibonacciNth5.nthFibonacci(n);
		    assertThat(actualResult).isEqualTo(expectedResult);
		}
	}


