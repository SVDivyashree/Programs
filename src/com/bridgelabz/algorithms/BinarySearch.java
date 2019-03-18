package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class BinarySearch {
	public static void main(String[] args) 
	{
		System.out.println("Press 1 for Integer and 2 for String");
		int input = Algorithms_util.inputinteger();
		long startTime = System.nanoTime();
		System.out.println("Enter number of elements");
		int n = Algorithms_util.inputinteger();
		switch (input) {
		case 1:
			Integer[] array = new Integer[n];
			System.out.println("Enter " + n + " integers");
			for (int i = 0; i < n; i++) {
				array[i] = Algorithms_util.inputinteger();
			}
			
			System.out.println("Enter the key");
			int key = Algorithms_util.inputinteger();
			
			Algorithms_util.binsearch(array, key);
			break;
		case 2:
			String[] strArray = new String[n];
			System.out.println("Enter" + n + "strings");
			for (int i = 0; i < n; i++) {
			strArray[i] = Algorithms_util.inputString();
			}
			Algorithms_util.bubbleSortString(strArray, n);
			System.out.println("Enter the key to search");
			String keyElement = Algorithms_util.inputString();
			Algorithms_util.binsearch(strArray, keyElement);
			break;
		default:
			System.out.println("Invalid Input ");
			break;
		}
		long endTime = System.nanoTime();
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The time taken to perform binary search operation is " + elapsed_time + "ns");
	}

}
