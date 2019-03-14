package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class InsertionString {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println("Enter the String :");
		String str = Algorithms_util.inputString();
		int n1=str.length();
		
		Algorithms_util.bubbleSortString(str, n1);
		long endTime = System.nanoTime();
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println("The elapsed time is:"+ elapsed_time+"ns");
	}
	
	}


