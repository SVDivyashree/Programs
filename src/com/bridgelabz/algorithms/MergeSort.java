package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;


public class MergeSort {

	public static void main(String[] args)
	{
		long startTime =System.nanoTime();
		System.out.println("Perform MergeSort operation for String");
		System.out.println("Enter the number of array elements:");
		int n=Algorithms_util.inputinteger();
		int i;
		System.out.println("Enter the array elements");
		String array[]=new String[n];
		int length=array.length;
		for( i=0;i<n;i++)
		{
			array[i]=Algorithms_util.inputString();
		}
		Algorithms_util.merge(array);
		for(String sort: array)
		{
			System.out.println(sort);	
		}
		long endTime = System.nanoTime();
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The elapsed time is:" +elapsed_time+"ns");



	}

}
