package com.java;

import java.util.ArrayList;
import java.util.List;

public class LastOccurrences18 {

	    public static List<Integer> firstAndLast(int[] arr, int N, int X) {
	        List<Integer> indices = new ArrayList<>();

	        int firstOccurrence = findFirstOccurrence(arr, N, X);
	        int lastOccurrence = findLastOccurrence(arr, N, X);

	        indices.add(firstOccurrence);
	        indices.add(lastOccurrence);

	        return indices;
	    }
	    private static int findFirstOccurrence(int[] arr, int N, int X) {
	        int low = 0, high = N - 1;
	        int firstIndex = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == X) {
	                firstIndex = mid;
	                high = mid - 1;
	            } else if (arr[mid] < X) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return firstIndex;
	    }
	    private static int findLastOccurrence(int[] arr, int N, int X) {
	        int low = 0, high = N - 1;
	        int lastIndex = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == X) {
	                lastIndex = mid;
	                low = mid + 1; 
	            } else if (arr[mid] < X) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return lastIndex;
	    }
	    public static void main(String[] args) {
	        int[] arr = { 1, 3, 3, 4 };
	        int N = arr.length;
	        int X = 5;

	        List<Integer> indices = firstAndLast(arr, N, X);

	        System.out.println("Indices of first and last occurrence of " + X + ": " + indices);
	    }
	}


