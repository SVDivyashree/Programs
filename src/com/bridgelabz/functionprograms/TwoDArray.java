package com.bridgelabz.functionprograms;

import com.bridgelabz.util.FunctionalUtil;

public class TwoDArray 
{
	public static void main(String[] args)
	{
	System.out.println("Enter the number of rows:" );
	int a=FunctionalUtil.inputinteger();
	System.out.println("Enter the number of cols:" );
	int b=FunctionalUtil.inputinteger();
	System.out.println("Enter the array elements: " );
	FunctionalUtil.twoDArray(a, b);
	}
}