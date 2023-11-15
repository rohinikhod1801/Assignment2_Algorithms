package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeString19Test {

	@Test
	public void testMergeString19() {
		String s1="abc";
		String s2="def";
		String actualresult = MergeString19.merge(s1,s2);
		assertEquals("adbecf", actualresult);
	}
}
