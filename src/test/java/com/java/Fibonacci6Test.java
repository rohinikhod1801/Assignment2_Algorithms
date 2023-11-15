package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Fibonacci6Test {

	@Test
	void testFibonacci() {
		int n = 5;
		List<Integer> result=new ArrayList<>();
		result.add(0);
		result.add(1);
		result.add(1);
		result.add(2);
		result.add(3);
		List<Integer> actualResult= Fibonacci6.series(n);
	    assertThat(actualResult).isEqualTo(result);
	}

}
