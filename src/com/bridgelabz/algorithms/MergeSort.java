package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;
import com.bridgelabz.util.FunctionalUtil;


public class MergeSort {

	public static void main(String[] args)
	{
		long startTime =System.nanoTime();
		System.out.println("Perform MergeSort operation for String");
		System.out.println("Enter the number of array elements:");
		int n=AlgorithmsUtil.inputinteger();
		int i;
		System.out.println("Enter the array elements");
		String array[]=new String[n];
		int length=array.length;
		for( i=0;i<n;i++)
		{
			array[i]=AlgorithmsUtil.inputString();
		}
		AlgorithmsUtil.merge(array);
		for(String sort: array)
		{
			System.out.println(sort);	
		}
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.stopWatch(startTime, endTime);
		System.out.println("The elapsed time is:" +elapsed_time+"ns");

	}

}
