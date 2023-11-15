package com.java;

public class PalindromeString4 {
	
	public static int isPalindrome(String str) {
		String newString = "";
		int n = str.length();
		 
		for (int i = n - 1; i >= 0; i--) {
			newString = newString + str.charAt(i);
		}
		 if(str.equalsIgnoreCase(newString))
	        {
			 return 1;
	        }
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {

		String str="abba";
		int result=isPalindrome(str);
		if(result==1) {
			System.out.println(str+" is a palindrome String");
		}
		else {
			System.out.println(str+" is not a palindrome String");
		}
	}

}
