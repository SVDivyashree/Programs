package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class InsertionSort {

	public static <T> void main(String[] args) 
	{
		
		System.out.println("Enter number of elements");
		int n = Algorithms_util.inputinteger();
		String[] strArray = new String[n];
		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) {
			strArray[i] = Algorithms_util.inputString();
		}
		System.out.println("Enter the key to search");
		String key = Algorithms_util.inputString();
		long startTime = System.nanoTime();
		Algorithms_util.insertionSort(strArray,key);
	    long endTime = System.nanoTime();
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The time taken to perform binary search operation is " + elapsed_time + "ns");
	}
}
		
		
