package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PrimeNumberTest {

	@Test
	public void testWithPrime() {
		int number = 37;
		int expectedResult=1;
		int actualResult= PrimeNumber1.isPrime(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testNotPrime() {
		int number = 10;
		int expectedResult=0;
		int actualResult= PrimeNumber1.isPrime(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
	

}
