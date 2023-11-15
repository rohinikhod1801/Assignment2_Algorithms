package com.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SmallestElement14Test {

	@Test
	public void smallestAndSecondSmallestNo14() {

		List<Integer> arrList =new ArrayList<>();
		arrList.add(5);
		arrList.add(2);
		arrList.add(4);
		arrList.add(3);
		arrList.add(5);
		arrList.add(6);
		ArrayList<Integer> result = SmallestElement14.minAnd2ndMin(arrList);
		ArrayList<Integer> expResult = new ArrayList<>();
		expResult.add(2);
		expResult.add(3);
		assertEquals(expResult, result);
	}

}
