package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubset8 {

	    public static List<List<Integer>> AllSubsets(int[] arr, int N) {
	        List<List<Integer>> result = new ArrayList<>();
	        List<Integer> currentSubset = new ArrayList<>();
	        
	        Arrays.sort(arr);

	        generateSubsets(arr, N, 0, currentSubset, result);

	        return result;
	    }

	    private static void generateSubsets(int[] arr, int N, int index, List<Integer> currentSubset, List<List<Integer>> result) {
	        result.add(new ArrayList<>(currentSubset));

	        for (int i = index; i < N; i++) {
	            if (i > index && arr[i] == arr[i - 1]) {
	                continue;
	            }
	            
	            currentSubset.add(arr[i]);
	            generateSubsets(arr, N, i + 1, currentSubset, result);

	            currentSubset.remove(currentSubset.size() - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2};
	        int N = arr.length;

	        List<List<Integer>> subsets = AllSubsets(arr, N);

	        System.out.println("All possible unique subsets in lexicographical order:");
	        for (List<Integer> subset : subsets) {
	            System.out.println(subset);
	        }
	    }
	}

