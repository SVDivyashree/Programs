package com.bridgelabz.algorithms;

import com.bridgelabz.util.Algorithms_util;

public class SwapNibbles {

	public static void main(String[] args) {
	    System.out.println("Enter the number"); 
	    int x =  Algorithms_util.inputinteger();
		int res=Algorithms_util.swapNibbles(x);
		System.out.println("Number after swapping nibbles " +res);
		boolean result=Algorithms_util.isPowerOfTwo(res);
		
		if(result==true)
			System.out.println("The result is a power of two");
		else
			System.out.println("The result is not a power of two");
		}


	}


