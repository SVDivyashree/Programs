package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class BubbleSort {

	public static void main(String[] args)
	{
		System.out.println("Give an input value");
		int input= Algorithms_util.inputinteger();
		if(input==1)
			System.out.println("Perform BubbleSort operation for integers");
		if(input==2)
			System.out.println("Perform BubbleSort operation for String");
	
		long startTime = System.nanoTime();
		switch (input) {
		case 1:
		System.out.println("Enter the number of array elements:");
		int n=Algorithms_util.inputinteger();
		int ar[]=new int[n];
		System.out.println("Enter the array elements");
		for(int k=0;k<n;k++)
		{
		ar[k]=Algorithms_util.inputinteger();
		}
		Algorithms_util.bubbleSortInt(ar, n);
		
		case 2:
			System.out.println("Enter the number of array elements:");
			int n1=Algorithms_util.inputinteger();
			int i;
			String array[]=new String[n1];
			System.out.println("Enter the array elements");
			for( i=0;i<n1;i++)
			{
			array[i]=Algorithms_util.inputString();
			}
			Algorithms_util.bubbleSortString(array, n1);
			
           
			break;
		default:
		break;
		}
		long endTime = System.nanoTime();
		
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The elapsed time is:" +elapsed_time+"ns");
		

	}

	}

