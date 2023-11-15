package com.java;

public class SubSequence17 {

	public static int isSubSequence(String a, String b) {
		int i = 0;
		int j = 0;
		if (a.isBlank()) {
			return 1;
		}
		if (b.isBlank()) {
			return 0;
		}
		if (a.length() <= b.length()) {
			while (i < a.length() && j < b.length()) {
				if (a.charAt(i) == b.charAt(j)) {
					i++;
					j++;
				} else {
					j++;
				}
			}
			if (i == a.length())
				return 1;
			else
				return 0;
		} else
			return 0;

	}

	public static void main(String[] args) {
		String a="AXY";
		String b="YADXCP";
		int n=isSubSequence(a,b);
		System.out.println(n);
	}

}
