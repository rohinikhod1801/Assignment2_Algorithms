package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CountSubset9Test {

	@Test
	public void countOfSubsetsEvenNo9(){
		int arr[]={4,2,1,9,2,6,5,3};
		int actualResult=CountSubset9.count(arr);
		int expectedResult=7;
		assertThat(actualResult).isEqualTo(expectedResult);

				
	}

}
