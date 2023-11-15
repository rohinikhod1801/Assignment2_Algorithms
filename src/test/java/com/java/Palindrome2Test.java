package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Palindrome2Test {

	@Test
	public void testWithPalindrome() {
		int number = 1221;
		int expectedResult=1;
		int actualResult= Palindrome2.isPalindrome(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	public void testNotPalindrome() {
		int number = 1230;
		int expectedResult=0;
		int actualResult= Palindrome2.isPalindrome(number);
	    assertThat(actualResult).isEqualTo(expectedResult);
	}
	

}
