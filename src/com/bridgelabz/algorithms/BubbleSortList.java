package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.Algorithms_util;

public class BubbleSortList {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		int n=Algorithms_util.inputinteger();
		List<Integer> numbers= new ArrayList<>();
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
		{
			numbers.add(Algorithms_util.inputinteger());
		}
		Algorithms_util.bubble(numbers, n);
	}

}
