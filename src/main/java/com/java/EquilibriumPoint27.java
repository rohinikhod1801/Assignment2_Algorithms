package com.java;

public class EquilibriumPoint27 {

	
	public static int getEquilibriumPoint(int[] arr) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++)
			sum1 = sum1 + arr[i];
		for (int j = 0; j < arr.length; j++) {
			sum1 = sum1 - arr[j];
			if (sum1 == sum2) {
				return (j + 1);
			}
			sum2 = sum2 + arr[j];
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {1,3,5,2,2};
		int result = getEquilibriumPoint(a);
		System.out.println(result);
	}

}
