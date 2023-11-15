package com.java;

public class FibonacciNth5 {

	public static int nthFibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		int a = 0, b = 1, c;

		for (int i = 2; i <= n; i++) {
			c = (a + b) % 10;
			a = b;
			b = c;
		}

		return b;
	}

	public static void main(String[] args) {
		int n = 5;

		int result = nthFibonacci(n);

		System.out.println("The " + n + "th Fibonacci number is: " + result);
	}
}
