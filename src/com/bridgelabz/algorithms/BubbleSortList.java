package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Algorithms_util;

public class BubbleSortList {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		int n=Algorithms_util.inputinteger();
		List<String> numbers= new ArrayList<>();
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
		{
			numbers.add(Algorithms_util.inputString());
		}
		String []array = new String[n];
		for(int i=0;i<n;i++)
		{
			array[i]=numbers.get(i);
		}
		Algorithms_util.bubbleSort(array, n);
	}

}
