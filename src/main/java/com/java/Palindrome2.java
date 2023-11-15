package com.java;
public class Palindrome2 {
	    public static int isPalindrome(int number) {
	        String numStr = Integer.toString(number);
	        int length = numStr.length();
	        	        
	        for (int i = 0; i < length / 2; i++) {
	            if (numStr.charAt(i) != numStr.charAt(length - 1 - i)) {
	                return 0; 
	            }
	        }
	        
	        return 1; 
	    }
	    public static void main(String[] args) {
	        int number = 1221;
	        int result = isPalindrome(number);
	        if(result==1) {
	        System.out.println("Output :"+ number +" Is a Palindrome");
	        }
	        else {
	        	   System.out.println("Output :"+ number +" Is not a Palindrome");
	        }
	    }
	}


