package com.bridgelabz.functionprograms;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.bridgelabz.util.FunctionalUtil;

public class Permutation{

	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		String str = FunctionalUtil.inputString();
		int l=0;
		int n=str.length();
		String str1=FunctionalUtil.permutations(str, 0,n-1);
		
	}
}

