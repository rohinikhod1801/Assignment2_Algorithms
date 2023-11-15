package com.java;

public class ConfusedPappu7 {

	    public static int findDiff(int amount) {
	        int[] digitCount = new int[10];

	        while (amount > 0) {
	            int digit = amount % 10;
	            digitCount[digit]++;
	            amount /= 10;
	        }

	        int extraGiven = (digitCount[6] * 9) + (digitCount[9] * 6);

	        if (digitCount[6] > 0 && digitCount[9] > 0) {
	            int maxBoth = Math.max(digitCount[6], digitCount[9]);
	            extraGiven += (maxBoth - 1) * 6;
	        }

	        return extraGiven;
	    }

	    public static void main(String[] args) {
	        int amount = 9669;

	        int extraAmount = findDiff(amount);

	        System.out.println("Maximum extra amount : " + extraAmount);
	    }
	}

