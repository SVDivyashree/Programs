package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.FunctionalUtil;

public class Sorting {

	public static <T> void main(String[] args) 
	{
		System.out.println("Give an input value");
		int input=AlgorithmsUtil.inputinteger();
		System.out.println("Enter number of elements"); 
		int n = AlgorithmsUtil.inputinteger();
		String[] strArray = new String[n];
		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) {
			strArray[i] = AlgorithmsUtil.inputString();
		}
		switch(input)
		{
		case 1:
			long startTime = System.nanoTime();
			AlgorithmsUtil.bubbleSort(strArray);
			long endTime = System.nanoTime();
			long elapsed_time = FunctionalUtil.stopWatch(startTime, endTime);
			System.out.println("The time taken to perform bubbleSort "
					+ "operation is:" +elapsed_time + "ns");
			break;
		case 2:
			AlgorithmsUtil.bubbleSort(strArray);
			System.out.println("Enter the key to search");
			String keyElement = AlgorithmsUtil.inputString();
			long start = System.nanoTime();
			AlgorithmsUtil.binsearch(strArray, keyElement);
			long end = System.nanoTime();
			long elapsedTime = FunctionalUtil.stopWatch(start, end);
			System.out.println("The time taken to perform binary search operation is " +elapsedTime  + "ns");
			break;
		case 3:
			System.out.println("Enter the key to search");
			String key = AlgorithmsUtil.inputString();
			long startTime1 = System.nanoTime();
			AlgorithmsUtil.insertionSort(strArray);
			long endTime1 = System.nanoTime();
			long elapsed_time1 = FunctionalUtil.stopWatch(startTime1, endTime1);
			System.out.println("The time taken to perform insertion sort operation is " + elapsed_time1 + "ns");
			break;
		    default:
			break;
		}
	}
}


