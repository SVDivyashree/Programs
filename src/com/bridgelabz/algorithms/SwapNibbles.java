package com.bridgelabz.algorithms;

import com.bridgelabz.util.AlgorithmsUtil;

public class SwapNibbles {

	public static void main(String[] args) {
	    System.out.println("Enter the number"); 
	    int x =  AlgorithmsUtil.inputinteger();
		int res=AlgorithmsUtil.swapNibbles(x);
		System.out.println("Number after swapping nibbles " +res);
		boolean result=AlgorithmsUtil.isPowerOfTwo(res);
		
		if(result==true)
			System.out.println("The result is a power of two");
		else
			System.out.println("The result is not a power of two");
		}


	}


