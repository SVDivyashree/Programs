package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmsUtil;



public class BubbleSortList {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		int n=AlgorithmsUtil.inputinteger();
		List<String> numbers= new ArrayList<>();
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
		{
			numbers.add(AlgorithmsUtil.inputString());
		}
		String []array = new String[n];
		for(int i=0;i<n;i++)
		{
			array[i]=numbers.get(i);
		}
		AlgorithmsUtil.bubbleSort(array, n);
	}

}
