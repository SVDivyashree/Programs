package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Algorithms_util;

public class InsertionSortWord {

	public static void main(String[] args) {

		System.out.println("Enter the size of an array");
		int n=Algorithms_util.inputinteger(); 
		List<String> words= new ArrayList<>();
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
		{
			words.add(Algorithms_util.inputString());
		}
		String []array = new String[n];
		for(int i=0;i<n;i++)
		{
			array[i]=words.get(i);
		}
		System.out.println("Enter the key to search");
		String key = Algorithms_util.inputString();
		Algorithms_util.insertionSort(array,key);
	


	}

}
