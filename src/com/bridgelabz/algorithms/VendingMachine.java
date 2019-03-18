package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;

public class VendingMachine {

	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter the number");
		int n=Algorithms_util.inputinteger();
		int[] notes= new int[n];
		for( i=0;i<n;i++)
		{
	     notes[i]=Algorithms_util.inputinteger();
		}
		System.out.println("Enter the value");
		int value=Algorithms_util.inputinteger();
        Algorithms_util.vendorMachine(notes,value);
	}

}
