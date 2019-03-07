package com.bridgelabz.Function_Programs;

import com.bridgelabz.util.Functional_util;

public class TwoDArray 
{
	public static void main(String[] args)
	{
	System.out.println("Enter the number of rows:" );
	int a=Functional_util.inputinteger();
	System.out.println("Enter the number of cols:" );
	int b=Functional_util.inputinteger();
	System.out.println("Enter the array elements: " );
	Functional_util.twoDArray(a, b);
	}
}