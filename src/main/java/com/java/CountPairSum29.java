package com.java;

public class CountPairSum29 {

	public static int getPairsCount(int k, int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i] + arr[j]) == k)
					count++;
		return count;
	}

	
	public static void main(String[] args) {
		int k=6;
		int[] arr = {1, 5, 7, 1};		
		int result=getPairsCount(k,arr);
		System.out.println(result);
	}

}
