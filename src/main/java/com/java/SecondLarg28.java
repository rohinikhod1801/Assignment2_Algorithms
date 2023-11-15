package com.java;

import java.util.Arrays;

public class SecondLarg28 {

	public static int printLargest(int[] arr) {
		int size = arr.length;
		Arrays.sort(arr);
		int largest = arr[size - 1];
		for (int i = size - 1; i >= 0; i--) {
			if (largest != arr[i]) {
				largest = arr[i];
				break;
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		int result = printLargest(arr);
		System.out.println(result);
	}

}
