package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquilibriumPoint27Test {

	@Test
	public void equilibriumPoint() {
		int arr[] = { 1, 3, 5, 2, 2 };
		assertEquals(3, EquilibriumPoint27.getEquilibriumPoint(arr));

	}

}
