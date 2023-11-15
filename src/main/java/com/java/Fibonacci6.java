package com.java;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci6 {

	    public static List<Integer> series(int n) {
	        List<Integer> fibonacciSeries = new ArrayList<>();

	        int a = 0, b = 1;

	        if (n >= 1) {
	            fibonacciSeries.add(a);
	        }
	        if (n >= 2) {
	            fibonacciSeries.add(b);
	        }

	        for (int i = 3; i <= n; i++) {
	            int c = a + b;
	            fibonacciSeries.add(c);
	            a = b;
	            b = c;
	        }

	        return fibonacciSeries;
	    }

	    public static void main(String[] args) {
	        int n = 5; 
	        List<Integer> result = series(n);
	        System.out.println("Fibonacci Series " + n + "th term:");
	        for (int num : result) {
	            System.out.print(num +" ");
	        }
	    }
	}

