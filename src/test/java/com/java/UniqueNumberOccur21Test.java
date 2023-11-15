package com.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UniqueNumberOccur21Test {

	@Test()
	public void uniqueNoTrue(){
		
		 int[] arr1 = {1, 1, 2, 5, 5};
		 boolean expectedResult=UniqueNumberOccur21.isFrequencyUnique(arr1.length, arr1);
		 assertEquals(false, expectedResult);
	}

}
