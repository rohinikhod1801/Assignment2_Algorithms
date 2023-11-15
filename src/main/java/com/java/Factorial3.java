package com.java;

public class Factorial3 {
	
	public static int calculateFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int number = 4;
		int factorial = calculateFactorial(number);
		System.out.println("Output :"+factorial);
	}

}
