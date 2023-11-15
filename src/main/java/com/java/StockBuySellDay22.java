package com.java;

import java.util.ArrayList;
import java.util.List;

public class StockBuySellDay22 {
	
   public static List<Integer> stockBuySell(int A[], int n) {
        List<Integer> list = new ArrayList<>();
        
        int buyIndex = -1;
        int sellIndex = -1;
        
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                if (buyIndex == -1) {
                    buyIndex = i - 1;
                }
                sellIndex = i;
                if(i == n - 1) {
                    addToList(buyIndex, sellIndex, list);
                }
            } 
            else if(A[i] < A[i - 1]) { 
                addToList(buyIndex, sellIndex, list);
                buyIndex = -1;
            }
        }
        return list;
    }
    
    private static void addToList(int buyIndex, int sellIndex, List<Integer> list) {
        if(buyIndex != -1) {
            List<Integer> ls = new ArrayList<Integer>();
            ls.add(buyIndex);
            ls.add(sellIndex);
            list.addAll(ls);
            
        }
    }
    public static void main(String[] args) {
   
    	int[] A = {100,180,260,310,40,535,695};
    	int n=7;
    	List<Integer> list=stockBuySell(A,n);
    	System.out.println(list);
	}
}
	

