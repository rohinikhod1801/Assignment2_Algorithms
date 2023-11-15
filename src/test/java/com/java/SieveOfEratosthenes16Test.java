package com.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SieveOfEratosthenes16Test {

	
	@Test
	public void sieveofEratosthenes16(){
		List<Integer> resultList=SieveOfEratosthenes16.sieveOfEratosthenes(10);
		List<Integer> result=new ArrayList<>();
		result.add(2);
		result.add(3);
		result.add(5);
		result.add(7);
		assertEquals(resultList, result);
		
	}

}
