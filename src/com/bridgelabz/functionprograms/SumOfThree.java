package com.bridgelabz.functionprograms;

import com.bridgelabz.util.FunctionalUtil;

public class SumOfThree {

	public static void main(String[] args) {
		
		System.out.print("Enter the number of elements in an array=");
		int n= FunctionalUtil.inputinteger();
		int [] a= new int[n];
		System.out.println("The array elements are");
		for(int i=0;i<n;i++)
		{
		a[i]=FunctionalUtil.inputinteger();
		}
        FunctionalUtil.isTriplet(a, n,0 );
	}

}
