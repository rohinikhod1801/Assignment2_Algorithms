package com.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOccur21 {
	
	    public static boolean isFrequencyUnique(int N, int[] arr) {
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        Set<Integer> uniqueFrequencies = new HashSet<>();
	        for (int frequency : frequencyMap.values()) {
	            if (!uniqueFrequencies.add(frequency)) {
	                return false; 
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 1, 2, 5, 5};
	        System.out.println("Is unique for " + isFrequencyUnique(arr1.length, arr1));
	     
	    }
	}

