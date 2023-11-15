package com.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ImmediateSmaller11Test {

		@Test
	    public void testImmediateSmaller() {
			 int[] inputArray = {4, 2, 1, 5, 3};
		        int[] expectedOutput = {2, 1, -1, 3, -1};
		        Arrays.toString(expectedOutput);
		        int[] actualResult=  ImmediateSmaller11.immediateSmaller(inputArray);

		        assertEquals(Arrays.toString(expectedOutput),  Arrays.toString(actualResult));
	    }

}
