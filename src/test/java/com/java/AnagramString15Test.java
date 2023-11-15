package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramString15Test {

	@Test
	public void anagram() {
		String s1 = "cddgk";
		String s2 = "gcd";
		int actualResult = AnagramString15.anagram(s1, s2);
		assertEquals(2, actualResult);

	}
}
