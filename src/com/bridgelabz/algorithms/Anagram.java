package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;

public class Anagram {

	public static void main(String[] args)
	{
		System.out.println("Enter the two strings");
		String str1=AlgorithmsUtil.inputString();
		String str2=AlgorithmsUtil.inputString();
		
		boolean res=AlgorithmsUtil.isAnagram(str1, str2);
		if(res)
		System.out.println("The given strings are anagrams");
		else
		System.out.println("The given strings are not anagrams");	

	}

}
