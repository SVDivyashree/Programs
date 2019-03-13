package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class BubbleSortInt {

	public static void main(String[] args)
	{
		long startTime = System.nanoTime();
		System.out.println("Enter the number of array elements:");
		int n=Algorithms_util.inputinteger();
		int ar[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
		ar[i]=Algorithms_util.inputinteger();
		}
		Algorithms_util.bubbleSortInt(ar, n);
		
		long endTime = System.nanoTime();
		
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The elapsed time is:" +elapsed_time+"ns");
		

	}

}
