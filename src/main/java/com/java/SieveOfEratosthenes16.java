package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes16 {

	public static List<Integer> sieveOfEratosthenes(int n) {
		boolean[] arrIsPrime = new boolean[n + 1];
		List<Integer> resultList = new ArrayList<>();
		Arrays.fill(arrIsPrime, true);
		for (int i = 2; i * i <= n; i++) {
			if (arrIsPrime[i]) {
				for (int j = 2 * i; j <= n; j = j + i) {
					arrIsPrime[j] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (arrIsPrime[i] == true) {
				resultList.add(i);
			}
		}
		return resultList;
	}
	
	
	public static void main(String[] args) {
		int n=10;
		List<Integer> resultList=sieveOfEratosthenes(10);
		for(int num:resultList) {
		System.out.print(num+ " ");
	}
	}
}
