package com.java;

import java.util.Arrays;

public class SmallestKth26 {

	public static int kthSmallest(int k,  int arr[]) {
 		if (k >= arr.length)
			return 0;

		Arrays.sort(arr);
		int result= arr[k - 1];
		
		return result;
	}
	
	public static void main(String[] args) {
		 int[] arr = {7,10, 4, 3, 20, 15};
		int k=3;
		 int result=kthSmallest(k,arr);
		 System.out.println(result);
	}

}
