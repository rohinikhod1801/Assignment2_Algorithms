package com.java;

public class MinimumCharactor24 {
	
	    public static int addMinChar(String str) {
	        StringBuilder revStr = new StringBuilder(str).reverse();

	        String concatStr = str + "$" + revStr.toString(); 

	        int[] lps = computeLPS(concatStr); 

	        return str.length() - lps[concatStr.length() - 1]; 
	    }

	    public static int[] computeLPS(String str) {
	        int len = str.length();
	        int[] lps = new int[len];
	        int j = 0;

	        for (int i = 1; i < len; i++) {
	            while (j > 0 && str.charAt(i) != str.charAt(j)) {
	                j = lps[j - 1];
	            }
	            if (str.charAt(i) == str.charAt(j)) {
	                j++;
	            }
	            lps[i] = j;
	        }

	        return lps;
	    }

	    public static void main(String[] args) {
	        String str1 = "ABCD";
	        System.out.println("Minimum characters to add for str1: " + addMinChar(str1));
	    }
	}