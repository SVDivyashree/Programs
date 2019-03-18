package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;

public class Anagram {

	public static void main(String[] args)
	{
		System.out.println("Enter the two strings");
		String str1=Algorithms_util.inputString();
		String str2=Algorithms_util.inputString();
		
		boolean res=Algorithms_util.areAnagram(str1, str2);
		if(res)
		System.out.println("The given strings are anagrams");
		else
		System.out.println("The given strings are not anagrams");	

	}

}
