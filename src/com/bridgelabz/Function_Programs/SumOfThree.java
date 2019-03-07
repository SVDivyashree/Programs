package com.bridgelabz.Function_Programs;

import com.bridgelabz.util.Functional_util;

public class SumOfThree {

	public static void main(String[] args) {
		
		System.out.print("Enter the number of elements in an array=");
		int n= Functional_util.inputinteger();
		int [] a= new int[n];
		System.out.println("The array elements are");
		for(int i=0;i<n;i++)
		{
		a[i]=Functional_util.inputinteger();
		}
        Functional_util.isTriplet(a, n,0 );
	}

}
