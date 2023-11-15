package com.java;

public class PrimeNumber1 {

	public static int isPrime(int number) {
		if(number==1||number==0) {
			return 0;
		}
	        for (int i = 2; i<=number/2; i++) {
	            if (number % i == 0) {
	                return 0;
	            }
	  }
		return 1;
			}	
	public static void main(String[] args) {
       int number = 37;
      int result= isPrime(number);
      
      if(result==1) {
   	     System.out.println("Output :"+number+" is prime number");
      } else {
    	  System.out.println("Output :"+number+" is not a prime number");
      }
      
}
	}



