package com.bridgelabz.Function_Programs;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.bridgelabz.util.Functional_util;

public class Permutation{

	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		String str = Functional_util.inputString();
		int l=0;
		int n=str.length();
		String str1=Functional_util.permutations(str, 0,n-1);
		
	}
}

