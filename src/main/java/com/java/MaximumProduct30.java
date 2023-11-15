package com.java;

public class MaximumProduct30 {

	public static int maxProduct(int[] arr) {
		int result = arr[0];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int mul = arr[i];
			for (int j = i + 1; j < n; j++) {
				result = Math.max(result, mul);
				mul *= arr[j];
			}
			result = Math.max(result, mul);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {6, -3, -10, 0, 2};
		int result =maxProduct(arr);
		System.out.println(result);
	}

}
