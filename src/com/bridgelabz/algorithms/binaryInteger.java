package com.bridgelabz.algorithms;

import java.util.Scanner;

import com.bridgelabz.util.Algorithms_util;
import com.bridgelabz.util.Functional_util;

public class BinaryInteger {

	public static void main(String[] args) 
	{  
		//Binary Integer
		int i;
		System.out.println("Enter number of elements");
		int n = Algorithms_util.inputinteger();
		int[] array=new int[n];
		System.out.println("Enter " + n + " integers");
	    for(i=0;i<n;i++)
	    {
	    array[i]=Algorithms_util.inputinteger();
	    }
	    System.out.println("Enter the key");
	    int key=Algorithms_util.inputinteger();
	    
		long startTime = System.nanoTime();
		
		Algorithms_util.binInt(array, n, key);
		long endTime = System.nanoTime();
		long elapsed_time = Functional_util.stopWatch(startTime, endTime);
		System.out.println(elapsed_time+"ns");
	    
	    
		
	}
	}


