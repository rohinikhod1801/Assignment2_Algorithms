package com.java;

import java.util.HashSet;

public class CountSubset9 {

	public static void main(String[] args) {
		
		int[] arr = {10, 3, 4, 2, 4, 20, 10, 6, 8, 14, 2, 6, 9};
		
		int result=count(arr);
		System.out.println(result);
		
	}
		public static int count(int[] arr) {		
		HashSet<Integer> us = new HashSet<>();
		int even_count = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++)
			if (arr[i] % 2 == 0)
				us.add(arr[i]);
		even_count = us.size();
		return (int) (Math.pow(2, even_count) - 1);
	}

	}


