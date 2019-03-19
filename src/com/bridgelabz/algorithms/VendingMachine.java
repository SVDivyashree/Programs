package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;

public class VendingMachine {

	public static void main(String[] args)
	{
		System.out.println("Enter the number of values:");
		int n= Algorithms_util.inputinteger();
		int[] change = new int[n];
		for(int i=0;i<n;i++)
		{
			change[i]=Algorithms_util.inputinteger();
		}
		System.out.println("enter the  money");
		int cash = Algorithms_util.inputinteger();
		Algorithms_util.vendorMachine(change, cash);
	}
}



