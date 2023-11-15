package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PalindromeString4Test {

	@Test
	void testPalindromeString() {
		String str="abba";
		int expectedResult=1;
		int actualResult= PalindromeString4.isPalindrome(str);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testNotPalindromeString() {
		String str="abbau";
		int expectedResult=0;
		int actualResult= PalindromeString4.isPalindrome(str);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}

}
