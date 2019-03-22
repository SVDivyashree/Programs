package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class Sorting {

	public static <T> void main(String[] args) 
	{
		System.out.println("Give an input value");
		int input=Algorithms_util.inputinteger();
		System.out.println("Enter number of elements"); 
		int n = Algorithms_util.inputinteger();
		String[] strArray = new String[n];
		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) {
			strArray[i] = Algorithms_util.inputString();
		}
		switch(input)
		{
		case 1:
			long startTime = System.nanoTime();
			Algorithms_util.bubbleSort(strArray, n);
			long endTime = System.nanoTime();
			long elapsed_time = Functional_util.stopWatch(startTime, endTime);
			System.out.println("The time taken to perform bubbleSort "
					+ "operation is:" +elapsed_time + "ns");
			break;
		case 2:
			Algorithms_util.bubbleSort(strArray, n);
			System.out.println("Enter the key to search");
			String keyElement = Algorithms_util.inputString();
			long start = System.nanoTime();
			Algorithms_util.binsearch(strArray, keyElement);
			long end = System.nanoTime();
			long elapsedTime = Functional_util.stopWatch(start, end);
			System.out.println("The time taken to perform binary search operation is " +elapsedTime  + "ns");
			break;
		case 3:
			System.out.println("Enter the key to search");
			String key = Algorithms_util.inputString();
			long startTime1 = System.nanoTime();
			Algorithms_util.insertionSort(strArray,key);
			long endTime1 = System.nanoTime();
			long elapsed_time1 = Functional_util.stopWatch(startTime1, endTime1);
			System.out.println("The time taken to perform insertion sort operation is " + elapsed_time1 + "ns");
			break;
		default:
			break;
		}
	}
}


