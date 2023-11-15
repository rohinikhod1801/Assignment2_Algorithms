package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Factorial3Test {

	@Test
	public void testFactorial() {
		int number = 4;
		int expectedResult=24;
		int actualResult= Factorial3.calculateFactorial(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	
}
