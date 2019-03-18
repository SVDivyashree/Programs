package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class InsertionSort {

	public static void main(String[] args)
	{
		System.out.println("Give an input value");
		int input= Algorithms_util.inputinteger();
		if(input==1)
			System.out.println("Perform InsertionSort operation for integers");
		if(input==2)
			System.out.println("Perform InsertionSort operation for String");
		long startTime = System.nanoTime();
		System.out.println("Enter the number of array elements:");
		int n=Algorithms_util.inputinteger();
		switch (input) {
		case 1:
		int ar[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
		ar[i]=Algorithms_util.inputinteger();
		}
		Algorithms_util.insertionSort(ar, n);
		break;
		case 2:
			String strArray[]=new String[n];
			System.out.println("Enter the array elements");
			for(int i=0;i<n;i++)
			{
			strArray[i]=Algorithms_util.inputString();
			}
			System.out.println("Enter the key");
            String key=Algorithms_util.inputString();
			Algorithms_util.insertSortString(strArray, n,key);
			break;
		default:
		break;
		}
		long endTime = System.nanoTime();
		
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The elapsed time is:" +elapsed_time+"ns");
		

	}

}