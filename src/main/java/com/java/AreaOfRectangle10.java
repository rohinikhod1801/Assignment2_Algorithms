package com.java;

public class AreaOfRectangle10 {
	
	   public int length;
	   public int breadth;

	    public AreaOfRectangle10(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public int area() {
	        return length * breadth;
	    }
	    public static int calculateArea(AreaOfRectangle10[] rectangles, int n) {
	        int maxArea = Integer.MIN_VALUE;

	        for (int i = 0; i < n; i++) {
	            int area = rectangles[i].area();
	            maxArea = Math.max(maxArea, area);
	        }

	        return maxArea;
	    }

	    public static void main(String[] args) {
	        int n = 3; 
	        AreaOfRectangle10[] rectangles = {
	                new AreaOfRectangle10(1, 2),
	                new AreaOfRectangle10(3, 4),
	                new AreaOfRectangle10(5, 6)
	        };

	        int maxArea = calculateArea(rectangles, n);
	        System.out.println("Maximum area among the given rectangles: " + maxArea);
	    }
	}

