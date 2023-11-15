package com.java;

public class LargestElement13 {

	public static int thirdLargest(int[] arr) {
		int temp;
		int size = arr.length;
		if (size < 3) {
			return -1;
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[size - 3];
	}	
		
	public static void main(String[] args) {
		int[] a = {2,4,1,3,5};
		int b=thirdLargest(a);
		System.out.println(b);
	}

}
