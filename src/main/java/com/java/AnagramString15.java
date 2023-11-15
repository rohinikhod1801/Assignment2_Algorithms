package com.java;

public class AnagramString15 {

	public static int anagram(String s1, String s2) {
		boolean[] visited = new boolean[50];
		boolean isAnagram = false;

		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 == len2)
			return 0;
		if (len1 > len2) {
			for (int i = 0; i < len2; i++) {
				isAnagram = false;
				for (int j = 0; j < len1; j++) {
					if (s1.charAt(j) == s2.charAt(i) && !visited[j]) {
						isAnagram = true;
						visited[j] = true;
						break;
					}
				}
				if (!isAnagram) {
					return 0;
				}
			}
			return len1 - len2;
		} else {
			for (int i = 0; i < len1; i++) {
				isAnagram = false;
				for (int j = 0; j < len2; j++) {
					if (s2.charAt(j) == s1.charAt(i) && !visited[j]) {
						isAnagram = true;
						visited[j] = true;
						break;
					}
				}
				if (!isAnagram) {
					return 0;
				}
			}
			return len2 - len1;
		}
	}
	
	public static void main(String[] args) {
		String s1 = "bcadeh";
		String s2 = "hea";
		int i=anagram(s1,s2);
		
		System.out.println(i);
	}

}
