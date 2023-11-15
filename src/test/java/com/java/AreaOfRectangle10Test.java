package com.java;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AreaOfRectangle10Test {

	@Test
	public void maximumAreaRectangle10Test(){
		int n = 3; 
		AreaOfRectangle10[] rect = new AreaOfRectangle10[3];
		rect[0] = new AreaOfRectangle10(1, 2);
		rect[1] = new AreaOfRectangle10(3, 4);
		rect[2] = new AreaOfRectangle10(5, 6);
		int actualResult=AreaOfRectangle10.calculateArea(rect,n);
		int expectedResult=30;
		assertThat(actualResult).isEqualTo(expectedResult);
	}
}
