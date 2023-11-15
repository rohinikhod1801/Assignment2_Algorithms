package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ConfusedPappu7Test {

	@Test
	void testConfusedPappu() {
		int amount = 9669;
		int expectedResult=36;
		int actualResult= ConfusedPappu7.findDiff(amount);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
}
