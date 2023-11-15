package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubSequence17Test {


	@Test
	public void subSequenceString() {
		String s1 = "AXY";
		String s2 = "YADXCP";
		int deleteWorld = SubSequence17.isSubSequence(s1, s2);
		assertEquals(0, deleteWorld);
	}

	@Test
	public void NotSubSequenceString() {
		String s1 = "gksrek";
		String s2 = "geeksforgeeks";
		int deleteWorld = SubSequence17.isSubSequence(s1, s2);
		assertEquals(1, deleteWorld);
	}

}
