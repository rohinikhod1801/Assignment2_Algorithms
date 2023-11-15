package com.java;

public class MissingNumArray25 {
	
	    public static int missingNumber(int[] nums, int N) {
	        int totalSum = N * (N + 1) / 2; 

	        int arraySum = 0;
	        for (int num : nums) {
	            arraySum += num; 
	        }
	        return totalSum - arraySum;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 5};
	        int N1 = arr1.length + 1;

	        System.out.println("Missing number for arr1: " + missingNumber(arr1, N1));
	    }
	}

