package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GoodOrBad20Test {

	@Test
	public void testGoodOrBad() {
		String S1 = " aeioup??";
		int actualresult = GoodOrBad20.isGoodorBad(S1);
		assertEquals(1, actualresult);


	}

}
