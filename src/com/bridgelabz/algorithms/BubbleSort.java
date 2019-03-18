package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class BubbleSort {

	public static void main(String[] args)
	{
		System.out.println("Give an input value");
		int input= Algorithms_util.inputinteger();

	    long startTime = System.nanoTime();
		switch (input) {
		case 1:
		System.out.println("Perform BubbleSort operation for integers");
		System.out.println("Enter the number of array elements:");
		int n=Algorithms_util.inputinteger();
		Integer array[]=new Integer[n];
		int k;
		System.out.println("Enter the array elements");
		for( k=0;k<n;k++)
		{
		array[k]=Algorithms_util.inputinteger();
		System.out.println(array[k]);
		}
        Algorithms_util.bubbleSort(array, n);
		break;
		case 2:
			System.out.println("Perform BubbleSort operation for String");
			System.out.println("Enter the number of array elements:");
			int n1=Algorithms_util.inputinteger();
			int i;
			String array1[]=new String[n1];
			
			for( i=0;i<n1;i++)
			{
			array1[i]=Algorithms_util.inputString();
			}
			Algorithms_util.bubbleSortString(array1, n1);
		default:
		break;
		}
		long endTime = System.nanoTime();
		
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The elapsed time is:" +elapsed_time+"ns");
		

	}
}

	

