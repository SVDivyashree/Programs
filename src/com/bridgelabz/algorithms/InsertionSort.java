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
		switch (input) {
		case 1:
		System.out.println("Enter the number of array elements:");
		int n=Algorithms_util.inputinteger();
		int ar[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
		ar[i]=Algorithms_util.inputinteger();
		}
		Algorithms_util.InsertionSort(ar, n);
		
		case 2:
            System.out.println("Enter the String :");
            Scanner sc = new Scanner(System.in);
            String str= sc.nextLine();
            int n1=str.length();
			Algorithms_util.insertSortString(str, n1);
			break;
		default:
		break;
		}
		long endTime = System.nanoTime();
		
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The elapsed time is:" +elapsed_time+"ns");
		

	}

}