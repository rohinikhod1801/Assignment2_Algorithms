package com.java;

public class ZigZag12 {

	    public static int zigZag(int[] arr, int n) {
	        boolean flag = true;

	        for (int i = 0; i < n - 1; i++) {
	            if (flag) {
	             
	                if (i % 2 == 0 && arr[i] > arr[i + 1]) {
	                    swap(arr, i, i + 1);
	                } else if (i % 2 != 0 && arr[i] < arr[i + 1]) {
	                    swap(arr, i, i + 1);
	                }
	            } else {
	             
	                if (i % 2 == 0 && arr[i] < arr[i + 1]) {
	                    swap(arr, i, i + 1);
	                } else if (i % 2 != 0 && arr[i] > arr[i + 1]) {
	                    swap(arr, i, i + 1);
	                }
	            }
	            flag = !flag;
	        }
			return n;
	    }
	    private static void swap(int[] arr, int a, int b) {
	        int temp = arr[a];
	        arr[a] = arr[b];
	        arr[b] = temp;
	    }

	    public static void main(String[] args) {
	        int[] arr = {4, 3, 7, 8, 6, 2, 1};
	        int n = arr.length;

	        System.out.println("Original Array:");
	        printArray(arr);

	        int result=zigZag(arr, n);

	        System.out.println("\nZig-Zag Array:"+result);
	        printArray(arr);
	    }
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	}

