package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmallestElement14 {
	public static ArrayList<Integer> minAnd2ndMin(List<Integer> arrList) {
	Set<Integer> resultSet = new HashSet<>(arrList);
	ArrayList<Integer> resultList = new ArrayList<>(resultSet);
	Collections.sort(resultList);
	int size = resultList.size();
	ArrayList<Integer> result = new ArrayList<>();
	if (size < 2) {
		result.add(-1);
		result.add(-1);
	} else if (size == 2) {
		result.add(resultList.get(0));
		result.add(-1);
	} else {
		result.add(resultList.get(0));
		result.add(resultList.get(1));
	}

	return result;
}
	public static void main(String[] args) {
		List<Integer> arrList =new ArrayList<>();
		arrList.add(5);
		arrList.add(2);
		arrList.add(4);
		arrList.add(3);
		arrList.add(5);
		arrList.add(6);
		ArrayList<Integer> result=minAnd2ndMin(arrList);		
		for(int num : result) {
			System.out.print(num+" ");
		}
	}
	

}
